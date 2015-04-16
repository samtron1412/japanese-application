package vn.rivercrane.service;

import java.util.List;
import org.springframework.stereotype.Service;
import vn.rivercrane.entity.User;

@Service
public interface UserSerivce {
	public List<User> getAllUser();
}