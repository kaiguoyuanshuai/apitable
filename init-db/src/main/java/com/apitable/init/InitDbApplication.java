package com.apitable.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author <a href="mailto:zhengkk@pingpongx.com">zhengkk</a>
 * @since 2023-08-19 23:04
 **/

@SpringBootApplication
public class InitDbApplication {

    /**
     * main class.
     *
     * @param args run arguments
     */
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(InitDbApplication.class);
        application.run(args);
    }
}