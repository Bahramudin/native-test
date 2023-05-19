package com.adil;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.adil.mapper")
public class NativeTestApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(NativeTestApplication.class, args);
	}
	
}
