package com.cg;

public class Student {
	private int id;
	private MathCheat mathcheat;
	public void setId(int id) {
		this.id = id;
	}

	public void setMathcheat(MathCheat mathcheat) {
		this.mathcheat = mathcheat;
	}

	public void Cheating()
	{
		mathcheat.mathcheat();
		System.out.println("The id of the student is " +id);
		
	}

}
