package interviewQuestions;

public class SalaryAndTaxCal {
	
	public static double taxCal(double percent, double BaseSal) {
		double Tax = percent * (BaseSal/100);
		return Tax;
	}

	public static void main(String[] args) {
		
		//Given Basic Salary B, Transport Allowance T, House Allowance H.
		//print the gross G and net salary N.
		//G = B + T + H
		//N = G - (G*Tax%)
		//8.2% Tax is levied if the gross is more than $55000 ; 4% otherwise 
		
		int B = 40000;
		int T = 2000;
		int H = 5000;
		double G = B+T+H;
		double Tax = 0;
		
		
		System.out.println("Gross Salary : "+G); //47000
		
		if(G > 55000) {//Tax 8.2%
			Tax = taxCal(8.2,G);
		}else {//Tax 4%
			Tax = taxCal(4,G);
		}
		
		System.out.println("Tax : "+Tax);
		double N = G - Tax;
		System.out.println(N);
		
		
		
		
		
	}

}
