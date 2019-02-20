package com.spx0315.dao;

import com.spx0315.model.User;

import java.sql.SQLException;

public interface UserDao {

    public User login(User user) throws SQLException;

}
