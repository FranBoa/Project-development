package com.eureka7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName:cc_App
 * Package:com.cc
 * Description:
 *
 * @Date: 2020/3/31 0031 23:00
 * @Author:YAP
 */

@SpringBootApplication
@EnableEurekaServer  //Eureka server服务端的启动类，接受其它的微服务进行注册。
public class eureka7001 {
    public static void main(String[] args) { SpringApplication.run(eureka7001.class,args); }
}
