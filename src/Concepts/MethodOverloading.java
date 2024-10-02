package Concepts;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading ob=new MethodOverloading();
		
		ob.sum();
		ob.sum(10);
		ob.sum(10, 20);
		
		
		
	}
	
	public static void main(int p)
	{
		
	}
	public static void main(int q, int r)
	{
		
	}
	//Method Overloading:--> method name is same with diff argument or
	//                      input parameter within same class
	
	//same method name with same number of argument are not allowed , same number
	//of argument allowed with different datatypes
	
	//We can overload main method alse
	
	//we can not create method inside method
	
	public void sum() //0 input parameter
	{
		System.out.println("sum method-->0 input parameter");
	}
	
	public void sum(double a)//diff datatype
	{
		System.out.println("sum method--> diff datatype");
	}
	
	
	public void sum(int a) //1 input parameter
	{
		System.out.println("sum method--> 1 input parameter");
		System.out.println(a);
	}
	
	public void sum(int a, int c)
	{
		System.out.println("sum method--> 2 input parameter");
		System.out.println(a+c);
	}
}
