package com.myweb.dao;

import com.myweb.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    public User queryUser(String username, String password);
}
