package test;

public class Checkingaccount extends Account {
	double credit_limit , interest , loan_interest;
	Checkingaccount() {
	super(100);
	this.credit_limit = 500;
	this.interest = 0.01f;
	this.loan_interest = 0.07f;
	}

	public void debit(double b) {
		if (b >= credit_limit ){
			System.out.println("��� �ѵ� �ʰ�");
			getBalance();
		} else if (b > getBalance()) {
			System.out.println("�ܾ��� 0�� �̸��Դϴ�");
			setBalance(b);
		} else {
			setBalance(b);
		}
	}
	public double nextMonth() {	
		if (getBalance() >= 0){			
		return getBalance() + getBalance() * interest;
	} else {
		return  getBalance() + getBalance()*loan_interest;
	}	}	
}