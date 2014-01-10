package com.github.mushkevych.genfabeto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext spring = new ClassPathXmlApplicationContext("spring.xml", Main.class);
		BeanA a = spring.getBean("a", BeanA.class);
		a.doSomething();
	}
}
