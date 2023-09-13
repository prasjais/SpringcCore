package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/aloneconfig.xml");
		Person p = context.getBean("person1", Person.class);
		System.out.println(p);
		System.out.println(p.getFriends().getClass().getName()); //used to get the which type of array is being used
		System.out.println("------------------------------------------------------");
		System.out.println(p);
		System.out.println(p.getFees().getClass().getName());
		System.out.println("------------------------------------------------------");
		System.out.println(p.getProperties());
		System.out.println(p.getProperties().getClass().getName());
		

	}

}
