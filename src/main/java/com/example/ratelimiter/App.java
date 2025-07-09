package com.example.ratelimiter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Override
    public void run(String... args) {
        RateLimiter limiter = new TokenBucketRateLimiter(5, 2);
        for (int i = 0; i < 10; i++) {
            boolean allowed = limiter.allowRequest();
            System.out.println("Request " + i + " allowed? " + allowed);
            try {
                Thread.sleep(300); // Simulate time passing
            } catch (InterruptedException ignored) {}
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
