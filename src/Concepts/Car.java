package Concepts;

public class Car {
	
	//Class variable
	int model;
	int wheel;

	public static void main(String[] args) {
		
		//new Car :--> this is object of car class
		//new keyword :--> is used to create object
		//a,b,c: --> Object reference variable
		
		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
		
		a.model=2013;
		a.wheel=3;
		
		b.model=2014;
		b.wheel=4;
		
		c.model=2015;
		c.wheel=5;
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		System.out.println(b.model);
		System.out.println(b.wheel);
		System.out.println(c.model);
		System.out.println(c.wheel);
		

	}

}
