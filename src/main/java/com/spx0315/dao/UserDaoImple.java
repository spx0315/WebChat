package com.spx0315.dao;

import com.spx0315.model.User;

public class UserDaoImple implements UserDao {

    public User login(User user) {
        // QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "select * from user where username = ? and password = ?";
        User existUser = null;
        /*try {
            existUser = queryRunner.query(sql, new BeanHandler<User>(User.class), user.getUsername(), user.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("用户登录失败!");
        } */
        return existUser;

    }
}

