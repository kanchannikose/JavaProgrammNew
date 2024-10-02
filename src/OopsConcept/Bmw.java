package OopsConcept;

public class Bmw extends Car {
	
	//Method overriding--> when same method is present parent class as well as
	//                  child class with the same name and same no of arguments is called as method overriding
	
	public void start()//overriden method
	{
		System.out.println("Bmw--start");
	}
	
	public void stop()//overriden method
	{
		System.out.println("Bmw--stop");
	}
	
	public void threadSafty()
	{
		System.out.println("Bmw--threadSafty");
	}

}
