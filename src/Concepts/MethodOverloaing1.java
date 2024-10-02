package Concepts;

public class MethodOverloaing1 {

	public static void main(String[] args) {
		
		MethodOverloaing1 ob=new MethodOverloaing1();
		ob.demo();
	    ob.demo(20);
	    ob.demo(1233445778);
	    ob.demo(1234, 50);
	    ob.main(80);
	
	}
	
	public static void main(int k)
	{
		System.out.println("main method can overload");
		System.out.println(k);
	}
	
	public void demo()//0 input parameter
	{
		System.out.println("demo method-->0 input parameter");
	}
	
	public void demo(int a)//1 input parameter
	{
		System.out.println("demo method-->1 input parameter");
		System.out.println(a);
		
	}
	
	public void demo(double a)//diff datatypes
	{
		System.out.println("demo method-->diff datatypes");
		System.out.println(a);
	}
	
	public void demo(int a, int b)
	{
		System.out.println("demo method-->2 input parameter");
		System.out.println(a+b);
	}

}
