package test;

public class Account {
	double  balance;
	public Account (double b) {
		this.balance = b;
	}

	public void credit(int a) {               //입금
		balance += a;
	}
	public double getBalance() {			      //잔고확인
		return balance;
	}
	public void debit(int b) {	
		balance -= b;						  //출금

	}
	protected void setBalance() {
		
	}

}