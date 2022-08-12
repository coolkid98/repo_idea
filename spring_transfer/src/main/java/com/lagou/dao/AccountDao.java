package com.lagou.dao;

public interface AccountDao {
    //转出操作
    void out(String outUser,Double money);


    //转入操作
    void in(String inUser, Double money);
}
