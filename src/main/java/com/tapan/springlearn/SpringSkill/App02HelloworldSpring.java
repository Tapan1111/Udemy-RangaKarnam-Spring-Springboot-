package com.tapan.springlearn.SpringSkill;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloworldSpring {
	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2"));
		System.out.println(context.getBean("address"));

	}

}
