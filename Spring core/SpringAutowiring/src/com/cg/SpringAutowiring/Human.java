package com.cg.SpringAutowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
    @Qualifier("heartobj")
	private Heart heart;
	
	/*
	 * public Human() { System.out.println("Default constructor is calling"); }
	 * 
	 * @Autowired public Human(Heart heart) { this.heart = heart;
	 * System.out.println("Constructor is calling"); }
	 * 
	 * @Autowired
	 * 
	 * @Qualifier("heartobj") public void setHeart(Heart heart) { this.heart =
	 * heart; System.out.println("Setter method is calling");; }
	 */
	public void display() {
		if(heart != null)
		{
			heart.pump();
		}
		else
		{
			System.out.println("you are dead");
		}
	}
	

}
