package com.spx0315.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCUtils {

    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();

    // 获得连接池:
    public static DataSource getDataSource(){
        return dataSource;
    }

    // 获得连接
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }


}