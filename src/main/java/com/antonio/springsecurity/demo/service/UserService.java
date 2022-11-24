package com.antonio.springsecurity.demo.service;

import com.antonio.springsecurity.demo.entity.User;
import com.antonio.springsecurity.demo.user.CrmUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	public void save(CrmUser crmUser);
}
