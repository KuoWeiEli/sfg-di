package guru.springframework.sfg.di.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String greeting() {
        return "Hello World！ - From Primary Bean.";
    }
}
