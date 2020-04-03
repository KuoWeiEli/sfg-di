package guru.springframework.sfg.di.config;

import guru.springframework.sfg.di.services.GreetingService;
import guru.springframework.sfg.di.services.GreetingServiceFactory;
import guru.springframework.sfg.di.services.I18nENGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Configuration
public class GreetingServiceConfig {
    @Bean
    GreetingServiceFactory greetingServiceFactory() {
        return new GreetingServiceFactory();
    }

    @Primary
    @Profile({"EN", "default"})
    @Bean
    GreetingService i18nENGreetingService(GreetingServiceFactory factory) {
        return factory.createGreetingService("EN");
    }

    @Primary
    @Profile("TW")
    @Bean
    GreetingService i18NTWGreetingService(GreetingServiceFactory factory) {
        return factory.createGreetingService("TW");
    }

    @Primary
    @Bean
    @Profile("DE")
    GreetingService primaryGreetingService(GreetingServiceFactory factory) {
        return factory.createGreetingService("");
    }
}
