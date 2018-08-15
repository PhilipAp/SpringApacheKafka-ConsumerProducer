package com.philipap.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.philipap.kafka.producer.Sender;

@SpringBootApplication
public class ApacheKafkaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApacheKafkaApplication.class, args);
    }

    @Autowired
    private Sender sender;

    @Override
    public void run(String... strings) throws Exception {
        sender.send("Spring Kafka Producer and Consumer Example By PhilipAp");
    }
}