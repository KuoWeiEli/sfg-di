package guru.springframework.sfg.di.services;

import org.springframework.stereotype.Service;

@Service
public class PropertiesInjectedServiceImpl implements GreetingService {
    @Override
    public String greeting() {
        return "Hello World！ - Properties ";
    }
}
