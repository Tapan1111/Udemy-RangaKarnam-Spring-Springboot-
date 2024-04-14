package com.tapan.springlearn.SpringSkill.example1.depInj.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component
//class YourBusinessClass()
//{
//	@Autowired
//	Dependency1 dependency1;
//	@Autowired
//	Dependency2 dependency2;
//
//	public String topString() {
//		return "Using" + dependency1 + "and" + dependency2;
//	}
//	
//}

@Component
record Dependency1() {

}

@Component
record Dependency2() {

}

@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


		}
		

	}


}
