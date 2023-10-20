package com.learningSpringBoot.learnspringfreamwork.helloworld;

import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

record Person(String name, int age) {}; // we are not creating custom class just to test the management of class through spring
record Address (String street, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Anirban";
	}
	
	@Bean
	@Primary
	public int age() {
		return 24;
	}
	
	@Bean
	@Qualifier("Age")
	public int age2() { // We declared a Qualifier annotation and calling it in another Bean and auto wiring
		return 26;
	}
	
    @Bean(name="CustomBeanName") //with this I can set a custom bean name and call this bean using that custom name
    @Primary
    public Person person() {
    	return new Person("Arnab",23);
    }
    
    @Bean
    public Person personUsingMethodCall() { //Managing a bean by calling another bean method
    	return new Person(name(),age());     //Here name() and age() are two different Bean but are helping to manage anther bean
    }
    
    @Bean
    public Person personUsingParameter(String name, int age) { //passing name() and age() bean to pass as a argument 
    	return new Person(name,age);
    }
    
    @Bean
    public Person personUsingParameter2(String name, @Qualifier("Age") int Age) {  //Use of Qualifier annotation
    	return new Person(name,Age);
    }
    
    @Bean
    public Address address() {
    	return new Address("Elias road, Agarpara","Kolkata");
    }
}
