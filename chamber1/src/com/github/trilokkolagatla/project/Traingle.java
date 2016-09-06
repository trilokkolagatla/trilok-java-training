package com.github.trilokkolagatla.project;

import java.util.Scanner;

public class Traingle {
	private int edge1, edge2, edge3;

	public Traingle(int edge1, int edge2, int edge3) {
		this.edge1 = edge1;
		this.edge2 = edge2;
		this.edge3 = edge3;
	}

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		System.out.print("enter the value of x:");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		System.out.print("enter the value of y:");
		Scanner scan1 = new Scanner(System.in);
		y = scan1.nextInt();
		System.out.print("enter the value of z:");
		Scanner scan2 = new Scanner(System.in);
		z = scan2.nextInt();
		Traingle triangle = new Traingle(x, y, z);
		int triangleType = triangle.typeOfTriangle();

	}

	public int typeOfTriangle() {
		int bool=0;
		if (edge1>0) {

			if (edge1 == edge2 && edge2 == edge3) {

				System.out.println("Triangle is Equilateral Triangle");

			} else if ((edge1 == edge2 && edge1 != edge3) || (edge1 != edge2 && edge2 == edge3)) {

				System.out.println("Iososceles Triangle can be formed");

			} else {

				System.out.println("Scalen Traingle can be formed");

			}

		} else {

			System.out.println("Can't be formed triangle");

		}
		return 0;

	}

}
