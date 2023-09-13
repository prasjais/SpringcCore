package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		Emp emp1 = context.getBean("emp1", Emp.class); //Emp.class is used for type casting
		System.out.println(emp1);
		
		//Auto wire can't be used for primitive and string type , used only for object type
		//And here we are trying auto wiring using xml
		//if using autowire as "byName" then bean name should be same as object name;
		//if using autowire as "byType" then anything is fine
		//if using autowire as "Constructor then it will also check the name of bean and use constructor 

	}

	

}
