package guru.springframework.sfg.di.controllers;

import guru.springframework.sfg.di.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    public void getGreeting() {
        System.out.println(greetingService.greeting());
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }

    @Qualifier("setterInjectedServiceImpl")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
