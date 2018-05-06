package com.example.newa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class NewaApplication {

    public static void main(String[] args) {

        SpringApplication.run(NewaApplication.class, args);
    }
//
//    @Bean
//    CommandLineRunner runner(SubscriberRepository repository){
//        return  args -> {
//            repository.save(new Subscriber("Ben","Bob","bob@gmail.com"));
//        };
//    }
}
