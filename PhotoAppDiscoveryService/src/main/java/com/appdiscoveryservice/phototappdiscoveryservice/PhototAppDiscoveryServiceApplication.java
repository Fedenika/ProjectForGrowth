package com.appdiscoveryservice.phototappdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PhototAppDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhototAppDiscoveryServiceApplication.class, args);
    }

}
