package guru.springframework.sfg.di.config;

import guru.springframework.sfg.di.examplebean.FakeDataSource;
import guru.springframework.sfg.di.examplebean.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
// 多參數時可以使用可讀性較高的方式：
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")})
public class PropertyConfig {
    private final Environment env;
    @Value("${guru.username}")
    private String user;
    @Value("${guru.password}")
    private String password;
    @Value("${guru.url}")
    private String url;

    @Value("${guru.jms.username}")
    private String jmsUser;
    @Value("${guru.jms.password}")
    private String jmsPassword;
    @Value("${guru.jms.url}")
    private String jmsUrl;

    public PropertyConfig(Environment env) {
        this.env = env;
    }

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        // Use the environment properties
        fakeDataSource.setUser(env.getProperty("USER_NAME"));
//        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUser(jmsUser);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
