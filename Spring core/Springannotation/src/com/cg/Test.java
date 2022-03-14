package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//mport org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext("Collegeconfig.class");
		College college=context.getBean("collegebean",College.class);
		//System.out.println(collegebean);
		System.out.println("Config loaded " +college);
	}

}
