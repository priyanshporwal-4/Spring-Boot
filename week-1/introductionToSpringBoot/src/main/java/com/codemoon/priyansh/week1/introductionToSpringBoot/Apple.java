package com.codemoon.priyansh.week1.introductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


public class Apple {
    void eatApple() {
        System.out.println("I am eating Apple.");
    }

    @PostConstruct
    void callThisBeforeAppleUsed() {
        System.out.println("Creating apple before use");
    }

    @PreDestroy
    void callThisBeforeDestroy() {
        System.out.println("Destroying the bean");
    }
}
