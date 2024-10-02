package Concepts;

public class Car1 {
	
//Class variable
	int price;
	int seat;
	
	public static void main(String[] args) {
		
		//new Car :--> this is object of car class
		//new keyword :--> is used to create object
		//a,b,c: --> Object reference variable
		
		Car1 a=new Car1();
		Car1 b=new Car1();
		Car1 c=new Car1();
		
		a.price=4500;
		a.seat=2;
		
		b.price=5500;
		b.seat=3;
		
		c.price=6500;
		c.seat=4;
		
		System.out.println(a.price);
		System.out.println(a.seat);
		System.out.println(b.price);
		System.out.println(b.seat);
		System.out.println(c.price);
		System.out.println(c.seat);
	

	}

}
