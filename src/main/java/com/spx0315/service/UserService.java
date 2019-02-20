package com.spx0315.service;

import com.spx0315.dao.UserDao;
import com.spx0315.dao.UserDaoImple;
import com.spx0315.model.User;

import java.sql.SQLException;

public class UserService {
    public User login(User user) throws SQLException {
        UserDao dao = new UserDaoImple();
        return dao.login(user);
    }
}
