package guru.springframework.sfg.di.services;

public class I18nTWGreetingService implements GreetingService{

    @Override
    public String greeting() {
        return "哈囉世界！ -- TW";
    }
}
