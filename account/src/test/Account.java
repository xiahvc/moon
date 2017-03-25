package test;

public class Account {
	private double balance;
	Account (double b) {
		balance = b;
	}

	public void credit(double a) {balance += a;}
	public double getBalance(){return balance;}
	public void debit(double b) { balance -= b;}
	protected void setBalance(double b) {
		balance -= b;
	}
}