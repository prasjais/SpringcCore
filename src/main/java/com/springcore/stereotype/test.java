package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student = context.getBean("student", Student.class);
//		System.out.println(student);
//		System.out.println(student.getAddress());
//		System.out.println(student.getAddress().getClass().getName());
		// TODO Auto-generated method stub
		//by default component will create the object name same as class name in lowercase but if we want to create our 
		//own object name that we can give by @component("ob")
		//to pass value we need to create @value("Prashant")
		
		System.out.println(student.hashCode());
		Student student1 = context.getBean("student", Student.class);
		System.out.println(student1.hashCode());
		

	}

}
