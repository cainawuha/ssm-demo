package com.jason.service;

import com.jason.bean.User;

public interface UserService {
    public User checkLogin(String userName,String userPwd);
}
