package day44_AccessModifiers;

public class BankAccount {
	private String accountHolder;
	private long accountNumber;
	private double balance;
	
	public String getaccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder=accountHolder;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber=accountNumber;
	}
	public double getBalance() { 
		return balance;
	}
	public void setBalance(double balance) { 
		this.balance=balance;
	}

	public void deposit(double deposit) {
		balance+=deposit;
	}
	public void withdraw(double withdraw) {
		if(balance<=0) {
			System.out.println("Balance is less then zero.");
			return;
		}
		balance-=withdraw;
	}
	public double checkBalance() {
		return balance;
	}
}
