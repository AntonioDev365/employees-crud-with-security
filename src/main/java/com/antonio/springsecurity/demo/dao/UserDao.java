package com.antonio.springsecurity.demo.dao;

import com.antonio.springsecurity.demo.entity.User;

public interface UserDao {

    public User findByUserName(String userName);
    
    public void save(User user);
    
}
