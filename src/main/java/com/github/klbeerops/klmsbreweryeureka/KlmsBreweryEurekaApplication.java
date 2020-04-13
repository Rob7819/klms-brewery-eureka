package com.github.klbeerops.klmsbreweryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class KlmsBreweryEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KlmsBreweryEurekaApplication.class, args);
    }

}
