package com.mensajeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MensajeriaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MensajeriaApplication.class, args);
    }

}
