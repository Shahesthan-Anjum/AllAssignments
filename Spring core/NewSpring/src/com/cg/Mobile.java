package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config created");
		Airtel air=(Airtel)context.getBean("airtel");
		air.calling();
		air.data();
		Voda v=(Voda)context.getBean("voda");
		v.calling();
		v.data();
		
	}

}