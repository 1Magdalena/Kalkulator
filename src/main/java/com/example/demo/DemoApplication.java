package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

        Calculator calculator = new Calculator();

        double add = calculator.add(3,4);
        double sub = calculator.sub(7,3);

        System.out.println(add + "\n" + sub);
    }
}
