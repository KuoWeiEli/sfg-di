package guru.springframework.sfg.di.controllers;

import guru.springframework.sfg.di.service.ConstructInjectedServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructInjectedControllerTest {

    private ConstructInjectedController constructInjectedController;

    @BeforeEach
    void setUp() {
        constructInjectedController = new ConstructInjectedController(new ConstructInjectedServiceImpl());
    }

    @Test
    void getGreeting() {
        constructInjectedController.getGreeting();
    }
}