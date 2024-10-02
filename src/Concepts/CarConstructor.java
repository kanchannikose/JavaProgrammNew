package Concepts;

public class CarConstructor {
	
	String name;
	String model;
	int price;
	String engine;
	
	public CarConstructor(String name, String model, int price, String engine)
	{
		this.name=name;
		this.model=model;
		this.price=price;
		this.engine=engine;
	}
	

	public static void main(String[] args) {
		
		CarConstructor cs1=new CarConstructor ("Bmw", "b34",10,"Automatic");
		CarConstructor  cs2=new CarConstructor ("Audi", "d420", 7, "Automatic");
		CarConstructor  cs3=new CarConstructor ("Honda", "city", 5, "Manual");
		
		System.out.println(cs1.name +" "+cs1.model+ " "+cs1.price+" "+cs1.engine);
		System.out.println(cs2.name+" "+cs2.model+ " "+cs2.price+" "+cs2.engine);
		System.out.println(cs3.name+" "+cs3.model+" "+cs3.price+" "+cs3.engine);
		

	}

}
