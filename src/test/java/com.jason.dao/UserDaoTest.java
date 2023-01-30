package com.jason.dao;

import com.jason.bean.User;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-mvc.xml","classpath:spring-mybatis.xml"})
public class UserDaoTest {
    @Resource
    private UserDao userDao;
    @org.junit.Test
    public void queryByUserName() {
        User user = userDao.queryByUserName("wangwu");
        System.out.println(user);
    }
}