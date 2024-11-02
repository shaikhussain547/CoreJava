package InterfaceConcept;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		
		//dynamic polymorphism
		//child class obj can be referred by parent Interface reference var.
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
		ICICIBank ic = new ICICIBank();
		ic.educationLoan();
		ic.homeLoan();
		ic.carLoan();
		
		ic.debit();
		ic.credit();
		ic.transferMoney();
		
		ic.mutualFunds();
		ic.insurance();
		
		USBank us = new ICICIBank();
		us.credit();
		us.debit();
		us.transferMoney();
		
		
		
	}

}
