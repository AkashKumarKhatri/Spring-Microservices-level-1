package io.datapirates.ratingdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // it is optional but in older it mandatory
public class RatingDataServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RatingDataServiceApplication.class, args);
    }

}
