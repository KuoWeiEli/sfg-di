package guru.springframework.sfg.di.controllers;

import guru.springframework.sfg.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 12/26/19.
 */
@Controller
public class PropertyInjectedController {

    @Qualifier("propertiesInjectedServiceImpl")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.greeting();
    }

}
