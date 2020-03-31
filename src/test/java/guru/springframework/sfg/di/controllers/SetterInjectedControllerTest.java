package guru.springframework.sfg.di.controllers;

import guru.springframework.sfg.di.services.ConstructInjectedServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new ConstructInjectedServiceImpl());
    }

    @Test
    void getGreeting() {
        setterInjectedController.getGreeting();
    }
}