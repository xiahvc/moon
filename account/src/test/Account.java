package test;

public class Account {
	double  balance;
	public Account (double b) {
		this.balance = b;
	}

	public void credit(int a) {               //�Ա�
		balance += a;
	}
	public double getBalance() {			      //�ܰ�Ȯ��
		return balance;
	}
	public void debit(int b) {	
		balance -= b;						  //���

	}
	protected void setBalance() {
		
	}

}