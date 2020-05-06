package com.user.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class UserRegistrationApplication {
    public static void main(String []args){
        SpringApplication.run(UserRegistrationApplication.class, args);
    }
}
