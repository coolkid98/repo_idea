package com.lagou.test;

import com.lagou.domain.Account;
import com.lagou.service.AccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.plaf.PanelUI;
import java.util.List;

public class AccountServiceTest {
    ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    AccountService accountService = (AccountService) classPathXmlApplicationContext.getBean("accountService");

    @Test
    public void testSave(){
        Account lucy = new Account();
        lucy.setName("lucy");
        lucy.setMoney(888d);
        accountService.save(lucy);
    }

    @Test
    public void testFindById(){
        Account account = accountService.findById(3);
        System.out.println(account);
    }

    @Test
    public void testFindAll(){
        List<Account> all = accountService.findAll();
        for(Account account : all)
            System.out.println(account);
    }

    @Test
    public void testUpdate(){
        Account account = new Account();
        account.setId(3);
        account.setName("jack");
        account.setMoney(2000d);
        accountService.update(account);
    }

    @Test
    public void testDelete(){
        accountService.delete(3);
    }
}
