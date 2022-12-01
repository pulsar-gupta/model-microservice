package com.siemens.sascia.modelmicroservice;

import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;

@SpringBootApplication

public class ModelMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModelMicroserviceApplication.class, args);
    }

   /* @Bean
    RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }*/

/*    @Bean
    CommandLineRunner myCommandLineRunner(ObservationRegistry registry, RestTemplate restTemplate) {
        Random highCardinalityValues = new Random(); // Simulates potentially large number of values

        return args -> {
            String highCardinalityUserId = String.valueOf(highCardinalityValues.nextLong(100_000));
            Observation.createNotStarted("my.observation", registry)
                    .observe(() -> {
                        log.info("====== Will send a request to the server from client 1");
                        String response = restTemplate.getForObject("http://localhost:8081/one", String.class, highCardinalityUserId);
                        log.info("Got response [{}]", response);
                    });

        };*/
    //}

    /*Random randomUserTypePicker = new Random();

    private String randomUserTypePicker(List<String> lowNumberOfValues) {
        return lowNumberOfValues.get(randomUserTypePicker.nextInt(2));
    }*/
}
