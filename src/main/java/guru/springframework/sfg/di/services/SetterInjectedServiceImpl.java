package guru.springframework.sfg.di.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedServiceImpl implements GreetingService {
    @Override
    public String greeting() {
        return "Hello World！ - setter";
    }
}
