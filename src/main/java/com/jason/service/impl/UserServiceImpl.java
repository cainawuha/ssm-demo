package com.jason.service.impl;

import com.jason.bean.User;
import com.jason.dao.UserDao;
import com.jason.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
//    @Transactional
    public User checkLogin(String userName, String userPwd) {
        User user = userDao.queryByUserName(userName);
        if (user.getUserPwd().equals(userPwd)) {
            return user;
        }else { return null;}
    }
}
