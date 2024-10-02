package OopsConcept;

//If a class implementing any interface, then it is mandatory to define/override all the method of interface

public class HSBCBank implements USBank, BrazilBank      //child class
//we are acheving multiple inheritance
//--->is-a relationship --interface and class relationship

{
	//overriden from USBank
	public void credit()
	{
		System.out.println("HSBC-credit");
	}
	
	public void debit()
	{
		System.out.println("HSBC-debit");
	}
	
	public void transferMoney()
	{
		System.out.println("HSBC-transferMoney");
	}
	
	//seperate method of HSBCBank class
	public void educationLoan()
	{
		System.out.println("HSBC-edu loan");
	}
	
	public void carLoan()
	{
		System.out.println("HSBC-car loan");
	}
	
	//Overriden from BrazilBank
	public void mutualFund()
	{
		System.out.println("HSBC-mutualFund");
	}
	
	

}
