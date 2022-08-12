package com.lagou.dao;

public interface AccountDao {
    void out(String outUser, Double money);
    void in(String inUser, Double money);
}
