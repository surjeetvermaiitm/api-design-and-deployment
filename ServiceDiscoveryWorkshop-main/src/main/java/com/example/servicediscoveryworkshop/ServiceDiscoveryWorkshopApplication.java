package com.example.servicediscoveryworkshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryWorkshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryWorkshopApplication.class, args);
    }

}
