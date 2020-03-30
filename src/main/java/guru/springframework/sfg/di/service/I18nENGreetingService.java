package guru.springframework.sfg.di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nGreetingService")
public class I18nENGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Hello World！ --- EN";
    }
}
