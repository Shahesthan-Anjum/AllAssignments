package com.cg;
import com.cg.MainStudent;
public class Student {
	private int id;
	private String sname;
	

	public Student(int id) {
		
		this.id = id;
	}


	public Student(int id, String sname) {
		this.id = id;
		this.sname = sname;
	}


	/*
	 * public void setId(int id) { this.id = id;
	 * System.out.println("The setter method is called getid"); } public void
	 * setSname(String sname) { this.sname = sname;
	 * System.out.println("The setter method is called getname"); }
	 */
	public void display() {
		System.out.println("Student name is " +sname  + " and id of the student is " +id);
	}

}
