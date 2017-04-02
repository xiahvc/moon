package test;

public class Checkingaccount extends Account {
	double credit_limit , interest , loan_interest;
	
	Checkingaccount(double balance , double credit_limit , double interest , double loan_interest) {
	super(balance);
	this.credit_limit = credit_limit;
	this.interest = interest;
	this.loan_interest = loan_interest;
	}

	public void debit(double b) {
	/**	if (b >= credit_limit ){
			System.out.println("출금 한도 초과");
			getBalance();
		} else if (b > getBalance()) {
			System.out.println("잔액이 0원 미만입니다");
			setBalance(getBalance()-b);
		} else {**/
			setBalance(getBalance()-b);
		}
	public double nextMonth() {	
		if (getBalance() >= 0){			
		return getBalance() + getBalance() * interest;
	} else {
		return  getBalance() + getBalance()*loan_interest;
	}	
}
	//추상메소드구현
	public void passTime(int a){
		setBalance(getBalance() + getBalance() * loan_interest * a);
		
	}
	public double getWithdrawableAccount(){
		if ((getBalance() + credit_limit) <= 0) {
			return 0;
		} else {
			return getBalance() + credit_limit;
		}

	}
	public boolean isBankrupted() {
		boolean c = false;
		if (getBalance() <= 0) {
			c = true;
		}
		return c;
	}
}
