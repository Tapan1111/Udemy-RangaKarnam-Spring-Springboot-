package com.tapan.springlearn.SpringSkill;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2MethodCalls"));
		System.out.println(context.getBean("person3Parameter"));
		System.out.println(context.getBean("address2"));
//		System.out.println(context.getBean(Address.class));

		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

	}

}
