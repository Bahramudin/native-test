package com.adil.service;

import com.adil.domain.User;
import com.github.yulichang.base.MPJBaseService;

import java.util.List;

/**
 * @author Bahramudin ADIL
 * @created 20/05/2023 - 1:10 AM
 */
public interface UserService extends MPJBaseService<User> {
	
	List<User> listAll();
	
}
