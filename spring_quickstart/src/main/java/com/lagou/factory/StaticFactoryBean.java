package com.lagou.factory;

import com.lagou.dao.IUserDao;
import com.lagou.impl.UserDaoImpl;

public class StaticFactoryBean {
    public static IUserDao createUserDao(){
        return new UserDaoImpl();
    }
}
