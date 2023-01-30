package com.jason.dao;

import com.jason.bean.User;

public interface UserDao {
    public User queryByUserName(String name);
}
