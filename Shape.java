package com.Masai;

public class Shape {

	
	
	public void area(double radius) {
		System.out.println("Area of circle :" +(double)3.14*radius*radius);
	}
	
	public void area(int l,int b)
	{
		System.out.println("Area of rectangle :" +(l*b));
	
	}
	public void area(int s) {
		System.out.println("Area of rectangle :" +(s*s));

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s=new Shape();
	s.area(12);
		s.area(4);
		s.area(5, 4);
		

	}

}
