package com.github.trilokkolagatla.zipper;

import java.util.Scanner;

    public class Address {
	private String country;
	private  String state; 
	private String streetaddress;
	private String apartment;
	private int flatname;
	private double lat;
	private double longtitude;
	
	 public void setcountry(String country){
		 this.country=country;
	 }
	 public String getcountry(String country)
	 {
		 return country;
	 }
	 public void setstate(String state){
		 this.state=state;
	 }
	 public String getstate(String state)
	 {
		 return state;
	 }
	public void setstreet(String streetaddress){
		this.streetaddress=streetaddress;
	}
	public String getstreet(String streetaddress){
		return streetaddress;
	}
	
	public void setapartment(String apartment){
		this.apartment=apartment;
	}
	public String getapartment(String apartment){
		return apartment;
	}
	public void setflatdetails(int flatname){
		this.flatname=flatname;
	}
	public int getflatdetails(int flatname){
		return flatname;
	}
    public void setlat(double lat){
	this.lat=lat;
    }
    public double getlat(double lat){
	return lat;
    }
    public void setlongtitude(double longtitude){
	this.longtitude=longtitude;
     }
    public double getlongtitude(double longtitude){
	return longtitude;
	
}

    public static void main(String[] args) {
	Address ad=new Address();
	ad.getapartment(null);
	System.out.println("enter the apartment details:");
	Scanner sc=new Scanner(System.in);
	sc.next();
	sc.close();
}
}
