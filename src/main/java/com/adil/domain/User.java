package com.adil.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serial;

/**
 * @author Bahramudin ADIL
 * @created 20/05/2023 - 1:02 AM
 */
@Data
public class User {
	
	@Serial
	private static final long serialVersionUID = 3139361593440895486L;
	
	/**
	 * ID
	 */
	@TableId(type = IdType.AUTO)
	private Long id;
	
	private String name;
	private String username;
	private String email;
	private String gender;

}
