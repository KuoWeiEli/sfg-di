package guru.springframework.sfg.di.controllers;

import guru.springframework.sfg.di.service.ConstructInjectedServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertiesInjectedControllerTest {

    private PropertiesInjectedController propertiesInjectedController;

    @BeforeEach
    void setUp() {
        propertiesInjectedController = new PropertiesInjectedController();
        propertiesInjectedController.greetingService = new ConstructInjectedServiceImpl();
    }

    @Test
    void getGreeting() {
        propertiesInjectedController.getGreeting();
    }
}