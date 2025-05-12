package com.example.springbootpocv3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.springbootpocv3.TestEntityDTO")
@EnableJpaRepositories("com.example.springbootpocv3")
public class SpringBootPocV3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPocV3Application.class, args);
    }

}
