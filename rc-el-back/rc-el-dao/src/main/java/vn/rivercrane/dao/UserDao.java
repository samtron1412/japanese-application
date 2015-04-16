package vn.rivercrane.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import vn.rivercrane.entity.*;


@Component
public interface UserDao {

	public User getUser(int id);
	public List<User> getUserList();
}