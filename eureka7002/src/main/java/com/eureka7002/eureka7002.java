package com.eureka7002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName:eureka7002
 * Package:com.eureka7002
 * Description:
 *
 * @Date: 2020/4/1 0001 23:08
 * @Author:YAP
 */
@SpringBootApplication
@EnableEurekaServer
public class eureka7002 {
    public static void main(String[] args) { SpringApplication.run(eureka7002.class,args); }
}
