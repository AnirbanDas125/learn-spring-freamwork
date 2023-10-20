package com.learningSpringBoot.learnspringfreamwork.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Arrays;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
      //Launch a spring context
		
			var springContext = 
					new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
			  //Configure things i want spring to manage
				
				//We managed the the configuration class by @Configuration 
				// We created and managed the beans by @Bean
			
			// This way we are retrieving the data
			   System.out.println(springContext.getBean("name")); //calling bean methods by method name 
			   System.out.println(springContext.getBean("age"));
				
			   System.out.println(springContext.getBean("CustomBeanName")); // Calling the bean using custom set method name
				
				
				System.out.println(springContext.getBean("personUsingMethodCall"));
				System.out.println(springContext.getBean("personUsingParameter"));
				
				System.out.println(springContext.getBean("address")); // calling bean by bean method name
				System.out.println(springContext.getBean(Address.class)); //calling bean by passing class or Bean method type
				System.out.println(springContext.getBean(Person.class));
				
				// Below spring context methods are meant for get the beans created
				System.out.println(springContext.getBeanDefinitionCount());
				Arrays.stream(springContext.getBeanDefinitionNames()).forEach(System.out::println);
				System.out.println(springContext.getBeanDefinition("address"));
				
				System.out.println(springContext.getBean("age2"));
				
		

		
/***********************************************************************************************************/	
		
	//This is another way of putting a code block into try its called "try with resources" this will make the warning go  
		
//		try(var springContext = 
//				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
//			
//			System.out.println(springContext.getBean("name"));  
//			   System.out.println(springContext.getBean("age"));
//				
//			   System.out.println(springContext.getBean("CustomBeanName")); 
//				
//				
//				System.out.println(springContext.getBean("personUsingMethodCall"));
//				System.out.println(springContext.getBean("personUsingParameter"));
//				
//				System.out.println(springContext.getBean("address")); 
//				System.out.println(springContext.getBean(Address.class)); 
//				System.out.println(springContext.getBean(Person.class));
//				
//				
//				System.out.println(springContext.getBeanDefinitionCount());
//				Arrays.stream(springContext.getBeanDefinitionNames()).forEach(System.out::println);
//				System.out.println(springContext.getBeanDefinition("address"));
//				
//				System.out.println(springContext.getBean("age2"));
//			
//			}
		
		
		
	}
}
