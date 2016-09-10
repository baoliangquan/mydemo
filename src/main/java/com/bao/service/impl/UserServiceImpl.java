package com.bao.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bao.dao.IUserDao;
import com.bao.pojo.User;
import com.bao.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
