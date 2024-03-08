package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.time.LocalDateTime;

@SpringBootApplication
public class JavaTradingApplication {

    public static void main(String[] args) {

        SpringApplication.run(JavaTradingApplication.class, args);


    }

    @Bean
    CommandLineRunner run() {
        return args -> {

            System.out.println(LocalDateTime.now());

        };
    }

}
