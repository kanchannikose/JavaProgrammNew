package Concepts;

public class LocalVsGloabalVar {

	/*
	
	//--->Global variable/ class variable<---
	
	String name="Tom";
	int age=25;
	
	public static void main(String[] args) {
		
		LocalVsGloabalVar ob=new LocalVsGloabalVar();
		System.out.println(ob.name);
		System.out.println(ob.age);
		
		//--->Local variable for main method<---
		
		int i=10;
		System.out.println(i);
		
		

	}
	public void sum()
	{
		//local variable for sum method
		int i=10;
		int j=20;
	}


*/
	
	
	
	
	
	
	
	
	
	
	
	String name="Tasha";      //Global variable-->class variable
	int age=26;
	
	
	public static void main(String[] args) {
		
		int id=123344;             //local variable
		
		LocalVsGloabalVar lg=new LocalVsGloabalVar();
		lg.dataColl();
		System.out.println(lg.name);
		System.out.println(lg.age);
		System.out.println(id);
	
	}
	
	public void dataColl()            //non-static method
	{
		System.out.println("Dta--Collection");
	}
	
	
}
