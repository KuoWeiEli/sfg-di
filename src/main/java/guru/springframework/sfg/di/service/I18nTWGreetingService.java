package guru.springframework.sfg.di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("TW")
@Service("i18nGreetingService")
public class I18nTWGreetingService implements GreetingService{

    @Override
    public String greeting() {
        return "哈囉世界！ -- TW";
    }
}
