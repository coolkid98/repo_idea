package com.lagou.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.SQLException;

@Component
public class ConnectionUtils {
    @Autowired
    private DataSource dataSource ;

    private ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    public Connection getThreadConnection(){
        Connection connection = threadLocal.get();
        if(null == connection){
            try {
                connection =  dataSource.getConnection();
                threadLocal.set(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return connection ;
    }

    public void removeThreadConnection(){
        threadLocal.remove();
    }



}
