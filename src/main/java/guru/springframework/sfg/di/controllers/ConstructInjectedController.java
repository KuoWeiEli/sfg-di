package guru.springframework.sfg.di.controllers;

import guru.springframework.sfg.di.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructInjectedController {
    private final GreetingService greetingService;

    public ConstructInjectedController(@Qualifier("constructInjectedServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void getGreeting() {
        System.out.println(greetingService.greeting());
    }
}
