package guru.springframework.sfg.di.services;

public class GreetingServiceFactory {
    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "EN":
                return new I18nENGreetingService();
            case "TW":
                return new I18nTWGreetingService();
            default:
                return new PrimaryGreetingServiceImpl();
        }
    }
}
