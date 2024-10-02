package OopsConcept;
                           
public interface USBank {   //Parent interface
	
	int minBal=100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	

}


 //only method declaration
 //variable by default static in nature
 //variable value will not change
 //no static method in interface
 //no main method in interface
 //we can not create object of interface
 //interface is abstract in nature