package OopsConcept;

public class TestBank {

	public static void main(String[] args) {
		
	   System.out.println(USBank.minBal);
		
		//static polymorphism
		HSBCBank hs=new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		hs.mutualFund();
		
		
		
		//Dynamic polymorphism-->
		//Child class object can refered by parent interface reference variable

		USBank us=new HSBCBank();
		us.credit();
		us.debit();
		us.transferMoney();
		
		
	}

}
