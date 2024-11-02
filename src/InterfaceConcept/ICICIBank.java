package InterfaceConcept;

public class ICICIBank implements USBank, RBI{
	
	//RBI interface
	@Override
	public void educationLoan() {
		System.out.println("ICICI -- edu loan");
	}

	@Override
	public void homeLoan() {
		System.out.println("ICICI -- home loan");
	}

	@Override
	public void carLoan() {
		System.out.println("ICICI -- car loan");
	}
	
	//USBank interface
	@Override
	public void credit() {
		System.out.println("ICICI -- credit");
	}

	@Override
	public void debit() {
		System.out.println("ICICI -- debit");
	}

	@Override
	public void transferMoney() {
		System.out.println("ICICI -- transferMoney");
	}
	
	//ICICI Bank class methods:
	public void mutualFunds() {
		System.out.println("ICICI -- mutual funds");
	}
	
	public void insurance() {
		System.out.println("ICICI -- insurance");
	}
	
	

}
