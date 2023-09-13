package co.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("co/springcore/lifecycle/lifecycleconfig.xml");
//		Samosa s = (Samosa) context.getBean("s1");
//		System.out.println(s);
//		
//		context.registerShutdownHook(); //Used for destroy method and instead of ApplicationContext please use AbstractApplicationContext
		
//		System.out.println("-------------------------------------------------------------------");
//		Pepsi p = (Pepsi) context.getBean("s2");
//		System.out.println(p);
		context.registerShutdownHook();
		Example example = (Example) context.getBean("example");
		System.out.println(example);
	}

}

