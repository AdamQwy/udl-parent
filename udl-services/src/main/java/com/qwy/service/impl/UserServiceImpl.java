package com.qwy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qwy.mapper.UserMapper;
import com.qwy.pojo.User;
import com.qwy.service.UserService;

/**
 * <p>Title: UserServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: CodeChewer</p>
 * @author AdamQwy
 * @date 2017年6月26日 下午6:19:58
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void registe(User user) {
		userMapper.insertSelective(user);
	}

}
