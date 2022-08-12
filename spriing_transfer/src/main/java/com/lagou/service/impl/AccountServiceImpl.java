package com.lagou.service.impl;

import com.lagou.dao.AccountDao;
import com.lagou.service.AccountService;
import com.lagou.utils.TranscationManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao ;
    @Autowired
    private TranscationManager transcationManager;
    @Override
    public void transfer(String outUser, String inUser, Double money) {
        transcationManager.beginTranscation();
        try {
            accountDao.out(outUser,money);
            accountDao.in(inUser,money);
            transcationManager.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transcationManager.rollback();
        }finally {
            transcationManager.release();
        }
    }
}
