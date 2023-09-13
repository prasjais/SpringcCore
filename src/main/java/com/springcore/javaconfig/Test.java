package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(javaconfig.class);
//		Student student = context.getBean("firststudent", Student.class);
//		System.out.println(student);
//		student.Study();
		
		Student student = context.getBean("getStudent", Student.class);
		System.out.println(student);
		student.Study();

	}

}
