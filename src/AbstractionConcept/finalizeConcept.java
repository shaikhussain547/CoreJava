package AbstractionConcept;

public class finalizeConcept {
	//finalize is a method
	public void finalize() {
		System.out.println("finalize method");
	}

	public static void main(String[] args) {
		
		finalizeConcept f1 = new finalizeConcept();
		finalizeConcept f2 = new finalizeConcept();
		
		f1 = null;
		f2 = null;
		
		System.gc();
		
		
		
	}

}
