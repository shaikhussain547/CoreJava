package InterfaceConcept;

public class HSBCBank implements USBank, BrazilBank{//we are achieving multiple inheritance
	//"Is-a relationship"
	//If a class is implementing any interface, then its mandatory to define/override  all the methods of interface.
	@Override
	public void credit() {
		System.out.println("HSBC -- credit");
	}

	@Override
	public void debit() {
		System.out.println("HSBC -- debit");
	}

	@Override
	public void transferMoney() {
		System.out.println("HSBC -- transferMoney");
	}
	
	public void educationLoan() {
		System.out.println("HSBC -- educationLoan");
	}
	
	public void carLoan() {
		System.out.println("HSBC -- carLoan");
	}

	@Override
	public void mutualFund() {
		System.out.println("HSBC -- mutualFund");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
