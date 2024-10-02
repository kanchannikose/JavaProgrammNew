package AbstractionRel;

public abstract class Bank { // abstract class

	// abstract method-no method body
	// abstract class can have abstract method and nonabstract method
	// can not create object of abstract class
	// achieve--partial abstraction
	// static and non static and find and non final vari allow

	
	
	int amt = 100;
	final int rate = 10;
	static int laonRate = 5;

	// partial abstraction

	public abstract void loan(); // abstract method

	public void credit() {
		System.out.println("Bank--credit");
	}

	public void debit() {
		System.out.println("Bank--debit");
	}

}
