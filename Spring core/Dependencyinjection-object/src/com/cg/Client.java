package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args)
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Student s=context.getBean("s",Student.class);
		s.Cheating();
		
		Student1 s1=context.getBean("s2",Student1.class);
		s1.Cheating1();
		
		/*
		 * Student s=new Student(); MathCheat cheat=new MathCheat();
		 * s.setMathcheat(cheat); s.Cheating();
		 */	
		}

}
