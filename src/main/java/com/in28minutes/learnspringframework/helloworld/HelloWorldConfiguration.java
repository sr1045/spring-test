package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {
};

record Address(String firstLine, String city) {
};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Shubham";
	}

	@Bean
	public int age() {
		return 25;
	}

	@Bean
	public Person person2MethodCalls() {
		var person = new Person(name(), age(), address());
		return person;
	}

	@Bean
	@Primary
	public Person person3withParameters(String name, int age, Address address5) {
		return new Person(name, age, address5);
		
	}
	@Bean
	public Person person() {
		var person = new Person("Ravi", 20, address());
		return person;
	}

	@Bean(name = "address2")
	public Address address() {
		return new Address("Bajrang Colony", "Ashta");
	}
}
