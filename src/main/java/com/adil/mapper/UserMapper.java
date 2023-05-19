package com.adil.mapper;
import java.util.List;

import com.adil.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.yulichang.base.MPJBaseMapper;

/**
 * @author Bahramudin ADIL
 * @created 20/05/2023 - 1:01 AM
 */
public interface UserMapper extends MPJBaseMapper<User> {
	
	List<User> listAll();
	
}
