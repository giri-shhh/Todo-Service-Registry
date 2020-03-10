package com.example.todoserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TodoServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoServiceRegistryApplication.class, args);
    }
}
