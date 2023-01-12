package com.sera;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBusKafkaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBusKafkaClientApplication.class, args);
    }
    @Bean
    public ApplicationRunner runner(RemoteEventPublisher newTopicProducer) {
        return args -> {
            newTopicProducer.publishMyEvent();
        };
    }
}

