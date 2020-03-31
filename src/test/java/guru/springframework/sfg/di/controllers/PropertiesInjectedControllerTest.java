package guru.springframework.sfg.di.controllers;

import guru.springframework.sfg.di.services.ConstructInjectedServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertiesInjectedControllerTest {

    private PropertyInjectedController propertiesInjectedController;

    @BeforeEach
    void setUp() {
        propertiesInjectedController = new PropertyInjectedController();
        propertiesInjectedController.greetingService = new ConstructInjectedServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(propertiesInjectedController.getGreeting());
    }
}