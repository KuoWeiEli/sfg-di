package guru.springframework.sfg.di;

import guru.springframework.sfg.di.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("----- Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("----- Properties");
		PropertiesInjectedController propertiesInjectedController = (PropertiesInjectedController) ctx.getBean("propertiesInjectedController");
		propertiesInjectedController.getGreeting();

		System.out.println("----- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		setterInjectedController.getGreeting();

		System.out.println("----- Constructor");
		ConstructInjectedController constructInjectedController = (ConstructInjectedController) ctx.getBean("constructInjectedController");
		constructInjectedController.getGreeting();

	}

}
