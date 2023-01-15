package com.sera;

import com.sera.busevent.MyEvent;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.BusProperties;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBusKafkaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBusKafkaClientApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner(BusProperties busProperties, ApplicationEventPublisher eventPublisher) {
        return args -> {
            Thread.sleep(2000);
            eventPublisher.publishEvent(new MyEvent(this, busProperties.getId(), "client1", "sendedMessage"));
            Thread.sleep(2000);
        };
    }
}

