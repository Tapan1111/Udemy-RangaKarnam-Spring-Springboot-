package com.tapan.springlearn.SpringSkill;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {

};

record Person2(String name, int age, String suitcolor) {
};

record Addresss(String streetName, int ZipCode, String State) {
};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Tapan";
	}

	@Bean
	public int age() {
		return 15;
	}

	@Bean
	public Person person() {
		var person = new Person("Batman", 21);
		return person;
	}

	@Bean
	public Person2 person2() {
		var person = new Person2("SpiderMan", 19, "Red&Blue");
		return person;
	}

	@Bean
	public Addresss address() {
		var address = new Addresss("Raisena Hills", 0001, "Delhi");
		return address;
	}

}
