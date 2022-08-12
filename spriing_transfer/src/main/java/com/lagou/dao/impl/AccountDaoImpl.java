package com.lagou.dao.impl;

import com.lagou.dao.AccountDao;
import com.lagou.utils.ConnectionUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private QueryRunner queryRunner ;

    @Autowired
    private ConnectionUtils connectionUtils;

    @Override
    public void out(String outUser, Double money) {
        String sql = "update account set money = money - ? where name = ?";
        try {
            queryRunner.update(connectionUtils.getThreadConnection(), sql,money,outUser);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void in(String inUser, Double money) {
        String sql = "update account set money = money + ? where name = ?";
        try {
            queryRunner.update(connectionUtils.getThreadConnection(), sql,money,inUser);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
