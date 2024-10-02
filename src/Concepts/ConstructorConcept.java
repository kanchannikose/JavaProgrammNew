package Concepts;

public class ConstructorConcept {
	//class variable
	String name;
	int age;
	
	
	public ConstructorConcept() //0 input parameter
	{
		System.out.println("Default Cons");
	}
	
	public ConstructorConcept(int i) //1 input parameter
	{
		System.out.println("1 para cons");
		System.out.println(i);
	}
	
	public ConstructorConcept(int i, int j)//2 input parameter
	{
		System.out.println("2 para cons");
		System.out.println(i+ " "+j);
	}

	public ConstructorConcept(String name, int age)
	{
		this.name=name; //this.classvar=localvar
		this.age=age;
	}
	
	
	public static void main(String[] args) {
		
		ConstructorConcept csc= new ConstructorConcept();
		ConstructorConcept csc1=new ConstructorConcept(10);
		ConstructorConcept csc2=new ConstructorConcept(20, 30);
		ConstructorConcept csc3=new ConstructorConcept("Tom", 23);
		
		System.out.println(csc3.name +" "+csc3.age);
		
	}

}
