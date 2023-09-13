package com.springcore.constructorInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorInj/constructorconfig.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(p);
		
		Addition ad = (Addition) context.getBean("add");
		ad.doSum();
	}

}
