package project;

import java.util.Scanner;

public class Decimal{
	public int returnreverse(int n){
		System.out.print("enter the number n: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();	
		int d=0;
		while (n<=0)
		{
			d=d*10;
			d= d+n%10;
			n=n/10;
		}
		System.out.print(d);
		return d;
	}		
	
	public static void main(String [] args){
		int n;		
		Decimal d=new Decimal();
		d.returnreverse(3);
	}
	}
		
	