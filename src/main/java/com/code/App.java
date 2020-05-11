package com.code;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName:App Package:com.code Description:
 *
 * @Date: 2020/4/18 0018 15:23
 * @Author:YAP
 */
@MapperScan("com.code.dao")
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
