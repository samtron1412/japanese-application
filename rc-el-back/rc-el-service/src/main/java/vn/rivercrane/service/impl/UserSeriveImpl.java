package vn.rivercrane.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.rivercrane.dao.UserDao;
import vn.rivercrane.entity.User;
import vn.rivercrane.service.UserSerivce;

@Component
public class UserSeriveImpl implements UserSerivce {
	
	@Autowired
	private UserDao userDao;
	
	public List<User> getAllUser() {
		List<User> userList = userDao.getUserList();
		return userList;
	}

}
