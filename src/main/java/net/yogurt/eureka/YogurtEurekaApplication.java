package net.yogurt.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class YogurtEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(YogurtEurekaApplication.class, args);
    }

}
