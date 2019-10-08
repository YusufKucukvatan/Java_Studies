package aa_WarmUp;

public class HondaSale_3 {
	
	public static void main(String[] args) {

		int salary = 6_000;
		int cashinpocket = 9_999;
		int maxloan = salary * 10;
		int budget = cashinpocket + maxloan;

		boolean hasgoodincome = false;
		boolean hasgoodcreditscore = true;
		boolean nocriminalreport = true;
		boolean hasliecense = true;

		boolean eligible = (hasgoodincome || hasgoodcreditscore) && (hasliecense && nocriminalreport);
		boolean valid = salary >= 0 && cashinpocket >= 0;
		boolean Pilot = budget >= 50_000;
		boolean Odyssey = budget >= 40_000;
		boolean CRV = budget >= 35_000;
		boolean Accord = budget >= 30_000;
		boolean Civic = budget >= 25_000;
		boolean Fit = budget >= 20_000;
		boolean insufficientbudget = budget < 20_000;
		
		String youcan = "You are eligible to purchase Honda models below that we have in the showroom:";
		String youcan_t = "Your budget is "+budget+" and not available to purchase any Honda model that we have in the showroom.\nPlease search for used cars on Craig's List. Thank you";
		String Pilot1 = "- Pilot\n- Odyssey\n- CRV\n- Accord\n- Civic\n- Fit";
		String Odyssey1 = "- Odyssey\n- CRV\n- Accord\n- Civic\n- Fit";
		String CRV1 = "- CRV\n- Accord\n- Civic\n- Fit";
		String Accord1 = "- Accord\n- Civic\n- Fit";
		String Civic1 = "- Civic\n- Fit";
		String Fit1 = "- Fit";

		if (hasgoodcreditscore == true) 
		{
			budget = cashinpocket + maxloan;
		} else {
			budget = cashinpocket;
		}
		
		
		if (eligible == true) {
			if (valid) {
				if (insufficientbudget) {
					System.out.println(youcan_t);
				} else {
					System.out.println("Your budget is $" + budget + "." + youcan);
					if (Pilot) {
						System.out.println(Pilot1);
					} else if (Odyssey) {
						System.out.println(Odyssey1);
					} else if (CRV) {
						System.out.println(CRV1);
					} else if (Accord) {
						System.out.println(Accord1);
					} else if (Civic) {
						System.out.println(Civic1);
					} else {
						System.out.println(Fit1);
					}
				}
			} else {
				System.out.println("The amount you have typed is invalid.");
			}
		} else {
			System.out.println(
					"Unfortunately, you are not eligable to purchase a car. Please contact with your customer assistant for details.");
		}
	}
}
