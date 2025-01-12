package com.example.glab_309_6_1;

import com.example.glab_309_6_1.myservices.Coach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Glab30961Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Glab30961Application.class, args);
		// get the bean from spring container
		Coach theCoach = context.getBean(Coach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();

	}

}
