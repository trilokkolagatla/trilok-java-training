package project;

import java.util.Scanner;

public class natural {
	public static void main(String[]args){
		int i;
		System.out.println("enter the value of i:");
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		sc.close();
		int sum=0;int x=1;
		while(x<=i)
		{
			sum=sum+x;
			x++;
		}
		System.out.println(" numbers is :"+sum);	
		
	}

}
