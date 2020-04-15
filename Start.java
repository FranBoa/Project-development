package com.yh.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Start {
	public static void main(String[] args) {
		// 启动时调用初始化方法
		// gui
		SpringApplication.run(Start.class, args);
	}
}
