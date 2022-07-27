package com.myweb.service.impl;

import com.myweb.dao.UserDao;
import com.myweb.entity.User;
import com.myweb.service.Loginservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginserviceImpl implements Loginservice {
    @Autowired
    UserDao userDao;
    //查询用户
    @Override
    public User login(String username, String password) {
        return userDao.queryUser(username,password);
    }
}
