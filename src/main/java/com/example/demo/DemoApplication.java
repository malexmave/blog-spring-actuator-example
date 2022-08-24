package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@RestController
public class DemoApplication {
    Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/")
    public String index() {
        logger.info("Entering hello world function...");
        String AWS_KEY = SecretConfig.SECRET_AWS_ACCESS_KEY;
        String AWS_TOKEN = SecretConfig.SECRET_AWS_ACCESS_TOKEN;
        // Log secrets on DEBUG level
        logger.debug("Dumping AWS credentials for debugging purposes: Key: {} Token: {}", AWS_KEY, AWS_TOKEN);
        // Do some work with the AWS credentials
        return "Hello World!";
    }
}
