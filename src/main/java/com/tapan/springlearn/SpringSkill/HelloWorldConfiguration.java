package com.tapan.springlearn.SpringSkill;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

	record Person(String name, int age, Address address) {
	};

	record Address(String firstLane, String City) {
	};

	@Bean
	public String name() {
		return "Tapan";
	}

	@Bean
	public int age() {
		return 25;
	}

	@Bean
	public Person person() {
		return new Person("Tapan behera", 19, new Address("Naveen Niwas", "Bhubaneshwar"));
	}

	@Bean
	public Person person2MethodCalls() {
		return new Person(name(), age(), address());
	}

	@Bean
	public Person person3Parameter(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}

	@Bean(name = "address2")
	public Address address() {
		return new Address("Marathalli", "Banglore");
	}

	@Bean(name = "address3")
	public Address address3() {
		return new Address("Arei,BinjharPur", "Jajpur");
	}

}
