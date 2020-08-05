package com.mycafe.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MyCafeConfigServerApplication {
    public static void main(String[] args){
        SpringApplication.run(MyCafeConfigServerApplication.class);
    }
}
