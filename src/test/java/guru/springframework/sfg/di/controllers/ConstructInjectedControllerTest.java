package guru.springframework.sfg.di.controllers;

import guru.springframework.sfg.di.services.ConstructInjectedServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructInjectedControllerTest {

    private ConstructorInjectedController constructInjectedController;

    @BeforeEach
    void setUp() {
        constructInjectedController = new ConstructorInjectedController(new ConstructInjectedServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(constructInjectedController.getGreeting());
    }
}