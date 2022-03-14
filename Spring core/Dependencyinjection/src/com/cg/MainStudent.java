package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudent {

	public static void main(String[] args)
	{/*
		 * Student s=new Student(1,"Anjum"); s.display();
		 */
		
		  ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		  Student stud=context.getBean("s",Student.class); 
		  stud.display();
		 
		
		  Student s1=context.getBean("s1",Student.class); s1.display();
		  Student s2=context.getBean("s2",Student.class); s2.display();
		 
		
	}
}
