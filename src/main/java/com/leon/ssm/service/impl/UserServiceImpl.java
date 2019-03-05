package com.leon.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.leon.ssm.bo.User;
import com.leon.ssm.mapper.UserMapper;
import com.leon.ssm.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userMapper;

	@Override
	public User getUserById(int userId) {
		return this.userMapper.selectByPrimaryKey(userId);
	}

}