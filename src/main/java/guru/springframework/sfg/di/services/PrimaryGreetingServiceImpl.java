package guru.springframework.sfg.di.services;

public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String greeting() {
        return "Hello World！ - From Primary Bean.";
    }
}
