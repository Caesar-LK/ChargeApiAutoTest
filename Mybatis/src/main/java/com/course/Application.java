package com.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PreDestroy;
import javax.security.auth.login.Configuration;

/**
 * @author :Caesar
 * @date 2025/10/14 15:03
 **/

@SpringBootApplication
@EnableScheduling
public class Application {
    private static ConfigurableApplicationContext context ;
    public static void main(String[] args) {
        Application.context = SpringApplication.run(Application.class, args);
    }

    @PreDestroy
    public void close() {
        Application.context.close();
    }
}
