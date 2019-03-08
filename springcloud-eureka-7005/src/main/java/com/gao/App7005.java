package com.gao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class App7005 {
    public static void main(String[] args) {
        SpringApplication.run (App7005.class, args);
    }
}
