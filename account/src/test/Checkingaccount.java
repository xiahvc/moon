package test;

public class Checkingaccount extends Account implements Valuable {
	double credit_limit , interest , loan_interest;
	
	Checkingaccount(double balance , double credit_limit , double interest , double loan_interest) {
	super(balance);
	this.credit_limit = credit_limit;
	this.interest = interest;
	this.loan_interest = loan_interest;
	}

	public void debit(double b) throws Exception {
		if (b > credit_limit ){
			// System.out.println("출금 한도 초과");
			throw new Exception();		
		} else if (b < 0) {
			throw new Exception();
		} else {
			setBalance(getBalance()-b);
		}
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
	public double EstimateValue (int month) {
		double b =0;
		b = getBalance() + getBalance()*month*interest;
		return b;
	}
	public String toString(){
		return String.format("CheckingAccount_Balance : %f" , getBalance());
		}
    
	public double EstimateValue() {
		double b =0;
		b = getBalance() + getBalance()*1*interest;
		return b;
		}
	public void passTime (){
		setBalance(getBalance() + getBalance() * loan_interest * 1);
	}
}