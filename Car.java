package com.Masai;

public class Car {

	String model;
	String companyName;
	String Color;
	Engine engine;
	
	public static void main(String[] args) {
		
		Car c =new Car();
		c.model="Harrier";
		c.companyName="TATA";
		c.Color="Black";
		
		c.engine=new Engine();
		c.engine.Power=110;
		c.engine.hasTurbo=true;
		c.engine.manufacturer="tata";
		c.engine.rmp=10000;
		System.out.println("Car Model :"+c.model);
		System.out.println("Car companyName :"+c.companyName);
		System.out.println("Car color :"+c.Color);
		System.out.println("Car RPM : "+c.engine.rmp);
		System.out.println("Car power : "+c.engine.Power);
		System.out.println("Car Engine Manufacture :"+c.engine.manufacturer);
		System.out.println("Car Has Turbo :"+c.engine.hasTurbo);
		

//				
				
	}

}
