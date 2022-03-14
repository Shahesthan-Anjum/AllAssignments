package com.cg.array;

public class array {
	
		 public  void array1(int num,
			int length){
				 
				
				int[] result = new int[length];
				
				for (int i = 0; i < length; i++)
				{
					result[i] = num * (i + 1);
				}
				
				for (int i = 0; i < length; i++)
				{
					System.out.println(result[i]);
				}
			}
}
