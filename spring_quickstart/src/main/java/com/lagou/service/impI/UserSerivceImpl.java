package com.lagou.service.impI;

import com.lagou.dao.IUserDao;
import com.lagou.service.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserSerivceImpl implements IUserService {
    private IUserDao userDao;

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }


}
