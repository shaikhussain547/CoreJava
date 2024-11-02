package InterfaceConcept;

public interface USBank {
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//Only method declaration.
	//No method body - only method prototype.
	//In interface we can declare the variables, vars are by default static in nature.
	//variables value will not changed, its final/constant and static in nature.
	//no static method in interface.
	//No main method in interface.
	//we can not create the object of Interface.
	//Interface is abstract in nature.
	//abstraction -- 100%
	
}
