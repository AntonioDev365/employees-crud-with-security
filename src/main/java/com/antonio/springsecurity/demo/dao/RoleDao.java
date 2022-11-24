package com.antonio.springsecurity.demo.dao;

import com.antonio.springsecurity.demo.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
