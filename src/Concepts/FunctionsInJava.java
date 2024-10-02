package Concepts;

public class FunctionsInJava {
	
	//main method is void --->never return a value

	public static void main(String[] args) {  //static method
		
		FunctionsInJava ob=new FunctionsInJava();
		//after creating object, the copy of all nonstatic method will be given to this object
		//here ob is a reference variable
		
		
		ob.test();
		int l =ob.pqr();
		System.out.println(l);
		
		String s=ob.qa();
		System.out.println(s);
		
		int x=ob.division(30, 10);
		System.out.println(x);

	}
	
	
	//void - does not return any value
	//return type- void
	//non static methods
	
	public void test()  //no input no output
	{
		System.out.println("test method");
	}
	
	
	public int pqr() //no input some output
	{
		System.out.println("pqr method");
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}
	
	
	public String qa() // no input some output
	{
		System.out.println("qa method");
		String s="Selenium";
		
		return s;
	}
	
	public int division(int x, int y)
	{
		System.out.println("division method");
		int d=x/y;
		
		return d;
	
	}
	

}
