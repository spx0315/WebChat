package com.spx0315.dao;

import com.spx0315.model.User;

import java.sql.SQLException;

public class UserDaoImple implements UserDao {

    @Override
    public User login(User user) {

        String sql = "select * from user where username = ? and password = ?";
        User existUser = null;

        return existUser;
    }
}
