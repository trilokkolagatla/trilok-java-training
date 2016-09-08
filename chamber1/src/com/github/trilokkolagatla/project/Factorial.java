package com.github.trilokkolagatla.project;

import java.io.IOException;
import java.util.Scanner;

public class Factorial {
	private double i;
	public void setnumber(double i) {
		
       this.i=i;
	}
	public double returnFactorial(double i){
		double f=1;
		double j=1;
		if(i>0){
			for (j = 1; j <= i; j++) 
			{
				f = f * j;
			}
			
			return f;
		}else{
			return 0;
		}
	}
	public static void main(String args[]) throws NumberFormatException,
	IOException{
		double i;
		Factorial fact=new Factorial();
		System.out.println("enter the value of i:");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		if(i<=0)
		{
       throw new IllegalArgumentException(); 
	}	
		double number = fact.returnFactorial(i);
		sc.close();
		System.out.println("the value of fact is " + number);
	}
}