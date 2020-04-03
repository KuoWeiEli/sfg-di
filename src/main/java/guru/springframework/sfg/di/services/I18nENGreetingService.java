package guru.springframework.sfg.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class I18nENGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Hello World！ --- EN";
    }
}
