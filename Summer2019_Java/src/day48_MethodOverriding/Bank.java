package day48_MethodOverriding;

public class Bank {

	public void interestRate() {
		System.out.println("%9");
	}

	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.interestRate();
		
		BankOfAmerica obj1 = new BankOfAmerica();
		obj1.interestRate();
		
		Chase obj2 = new Chase();
		obj2.interestRate();
		
		CapitalOne obj3 = new CapitalOne();
		obj3.interestRate();
	}
}

class BankOfAmerica extends Bank {
	@Override
	public void interestRate() {
		System.out.println("%8"); //Overrides the Super Class' interestRate method
	}

}

class Chase extends Bank {
	@Override
	public void interestRate() {
		System.out.println("%7"); //Overrides the Super Class' interestRate method
	}
}

class CapitalOne extends Bank {
	@Override
	public void interestRate() {
		System.out.println("%6"); //Overrides the Super Class' interestRate method
	}
}
