package com.in28minutes.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacMan;

public class App02HelloWorldSpring {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			System.out.println("Name = " + context.getBean("name"));
			System.out.println("Age = " + context.getBean("age"));
			System.out.println("Person = " + context.getBean("person"));
			System.out.println("Address = " + context.getBean("address2"));
			System.out.println("Address = " + context.getBean(Address.class));
			System.out.println("person2MethodCalls = " + context.getBean("person2MethodCalls"));
			System.out.println("person3withParameters = " + context.getBean("person3withParameters"));
			String[] names = context.getBeanDefinitionNames();
			for (String string : names) {
				System.out.println("Name " + string);
			}

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println("Person Class" + context.getBean(Person.class));
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
