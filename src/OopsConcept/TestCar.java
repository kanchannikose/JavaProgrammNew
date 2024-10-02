package OopsConcept;

public class TestCar {

	public static void main(String[] args) {
		//Child class
		
		//Static polymorphism--compile time polymorphism
		Bmw bm=new Bmw();
		bm.start();
		bm.stop();
		bm.threadSafty();
		bm.refuel();
		bm.engine();
		
		System.out.println("******");
		
		
	//Here Car class is parent class and Bmw is child class 
	//We create object of Car class it will not inheriet the properties of
	//child class , child class inheriet the properties of parent class but parent class will not inherit the properties of child class
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		System.out.println("******");
		
		
		
		
  //Dynamic polymorphism--Run time polymorphism-->child class object
  //                      can referred by parent class ref variable		
  //--->Top casting<---
		Car c1=new Bmw();
		{
			c1.start();
			c1.stop();
			c1.refuel();
			c1.engine();
			
		}
		

		
		
    //--->Down Casting<---
		
		//Bmw b1=(Bmw)new Car(); //ClassCastException
	}

}
