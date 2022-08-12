package com.lagou.service.impl;

import com.lagou.dao.AccountDao;
import com.lagou.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao ;

    @Override
    public void transfer(String outUser, String inUser, Double money) {
        accountDao.out(outUser,money);
        accountDao.in(inUser,money);
    }
}
