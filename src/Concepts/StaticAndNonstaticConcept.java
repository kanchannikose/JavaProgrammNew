package Concepts;

public class StaticAndNonstaticConcept {
                 
	String name="Tina";  //non-static global variable
	static int age=25;  //static global variable
	
	public static void main(String[] args) {
		
		//calling static method and vari---2 ways
		//1) Direct calling
		sum();
		
		//2) Calling by classname
		StaticAndNonstaticConcept.sum();
		
		//calling static variable
		//1) Direct calling
		
		System.out.println(age);
		
		//2) Calling by classname
		
		System.out.println(StaticAndNonstaticConcept.age);
		
		
		
		System.out.println("**************");
		
		//calling non-static method and vari
		
		StaticAndNonstaticConcept snt=new StaticAndNonstaticConcept();
		snt.sendMail();
		System.out.println(snt.name);
		
		
		//Can I access static method by using object reference?--yes
	    snt.sum();  //gives yellow warning--this is not good practice

	}
	
	public void sendMail() //non-static method
	{
		System.out.println("mail method");
	}
	
	public static void sum()  //static method
	{
		System.out.println("sum method");
	}

}
