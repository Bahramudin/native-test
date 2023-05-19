package com.adil.service.impl;

import com.adil.domain.User;
import com.adil.mapper.UserMapper;
import com.adil.service.UserService;
import com.github.yulichang.base.MPJBaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bahramudin ADIL
 * @created 20/05/2023 - 1:11 AM
 */
@Service
public class UserServiceImpl extends MPJBaseServiceImpl<UserMapper, User> implements UserService {
	@Override
	public List<User> listAll() {
		return baseMapper.listAll();
	}
}
