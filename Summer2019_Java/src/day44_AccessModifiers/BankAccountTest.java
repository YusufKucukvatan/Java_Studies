package day44_AccessModifiers;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount customer1=new BankAccount();
		customer1.setBalance(5000);
		customer1.withdraw(250);
		customer1.deposit(500);
		System.out.println(customer1.getBalance());
		
		BankAccount customer2=new BankAccount();
		customer2.setBalance(10_000);
		customer2.withdraw(2000);
		customer2.deposit(500);
		System.out.println(customer2.getBalance());
	}
	

}
