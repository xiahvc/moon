package test;

public abstract class Account {
	private double balance;
	Account (double b) {
		balance = b;
	}

	public void credit(double a) {balance += a;}
	public double getBalance(){return balance;}
	public void debit(double b) { balance -= b;}
	protected void setBalance(double b) {balance = b;}
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int a);
}