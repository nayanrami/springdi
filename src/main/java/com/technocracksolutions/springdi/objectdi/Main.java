package com.technocracksolutions.springdi.objectdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
		Student student  = context.getBean("student",Student.class);
		student.cheating();
	}
}
