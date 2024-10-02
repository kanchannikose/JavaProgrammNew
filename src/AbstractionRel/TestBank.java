package AbstractionRel;

public class TestBank {

	public static void main(String[] args) {

		System.out.println("loan rate:-> "+ Bank.laonRate);
		
		
		HDFC hd = new HDFC();
		hd.credit();
		hd.debit();
		hd.loan();
		hd.fund();

		// dynamic polymorphism--top casting
		Bank bk = new HDFC();
		bk.credit();
		bk.debit();
		bk.loan();

	}

}
