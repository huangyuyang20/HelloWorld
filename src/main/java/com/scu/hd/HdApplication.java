package com.scu.hd;

import com.scu.hd.controller.LoginController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HdApplication {

    @Bean
    Logger getLog(){
        return LoggerFactory.getLogger(LoginController.class.getName());
    }

    public static void main(String[] args) {
        SpringApplication.run(HdApplication.class, args);
    }

}
