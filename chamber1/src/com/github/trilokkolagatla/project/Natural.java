package com.github.trilokkolagatla.project;

public class Natural {
	public int returnsum(int i){		
		int sum=0;int x=1;
//		System.out.println("enter the value of i:");
//		Scanner sc=new Scanner(System.in);
//		i=sc.nextInt();
//		sc.close();
			
		while(x<=i)
		{
			sum=sum+x;
			x++;
		}
		System.out.println(" numbers is :"+sum);
		return sum;
		
		
	}
	public static void main(String[]args){
		Natural n=new Natural();
		n.returnsum(5);
	}

}
