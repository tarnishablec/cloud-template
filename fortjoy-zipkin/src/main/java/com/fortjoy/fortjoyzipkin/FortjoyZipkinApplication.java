package com.fortjoy.fortjoyzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin2.server.internal.EnableZipkinServer;

@EnableZipkinServer
@EnableDiscoveryClient
@SpringBootApplication
public class FortjoyZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(FortjoyZipkinApplication.class, args);
    }

}

