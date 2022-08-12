package com.lagou.test;

import com.lagou.dao.IUserDao;
import com.lagou.service.IUserService;
import com.lagou.service.impI.UserSerivceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class SpringTest {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //IUserDao userDao = (IUserDao) applicationContext.getBean("userDao");
        //userDao.save();
        IUserDao bean = applicationContext.getBean(IUserDao.class);
        bean.save();
    }

    @Test
    public void test02(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDao userDao = (IUserDao) applicationContext.getBean("userDao");
        System.out.println(userDao);
        applicationContext.close();
    }

    @Test
    public void test03(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDao userDao = (IUserDao) applicationContext.getBean("userDao");

    }

    @Test
    public void test04(){

    }

    @Test
    public void test05(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = (IUserService) classPathXmlApplicationContext.getBean("UserService");
        userService.save();
    }

    @Test
    public void test06(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserDao userDao = (IUserDao) classPathXmlApplicationContext.getBean("userDao");
        userDao.save();

    }


}
