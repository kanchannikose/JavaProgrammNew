package Concepts;

public class Functions1InJava {

	public static void main(String[] args) {
		
		Functions1InJava obj=new Functions1InJava();
		
		obj.demo();
		
		int ca = obj.test();
		System.out.println(ca);
		
		String yaa=obj.practice();
		System.out.println(yaa);
		
		char zz = obj.viva();
		System.out.println(zz);
		
		int divv=obj.division(40, 20);
		System.out.println(divv);

	}
	
	
	
	//non static method
	public void demo()
	{
		System.out.println("Demo method");
	}
	
	
	public int test()
	{
		System.out.println("test method");
		int a=50;
		int b=20;
		int c=a+b;
		
		return c;
	}
	
	
	public String practice()
	{
		System.out.println("practice method");
		String xa="Selenium";
		String ya="Cucumber";
		
		return ya;
		
	}
	
	
	public char viva()
	{
		System.out.println("viva method");
		char z='v';
		char p='w';
		
		return z;
	}
	
	
	public int division(int x, int y)
	{
		System.out.println("division method");
		int div=x/y;
		
		return div;
	}

}
