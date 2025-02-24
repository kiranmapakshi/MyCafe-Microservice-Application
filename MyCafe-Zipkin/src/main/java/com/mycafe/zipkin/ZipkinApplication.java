package com.mycafe.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableZipkinServer
@EnableDiscoveryClient
public class ZipkinApplication {
    public static void main(String []args){
        SpringApplication.run(ZipkinApplication.class, args);
    }
}
