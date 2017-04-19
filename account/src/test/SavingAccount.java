package test;

public class SavingAccount extends Account implements Valuable {
	double interest;
	int b = 0;
	boolean tic = false;
	
	SavingAccount(double balance,double interest) {
		super(balance);
		this.interest = interest;
	}
	
	public void debit(double d) throws Exception {
		if (d >= getBalance() ){
			// System.out.println("출금 한도 초과");
			throw new Exception("dlrj");		
		} else if (d < 0) {
			throw new Exception();
		} else {
			setBalance(getBalance()-d);
		}
	}
	//추상메소드구현
	public void passTime(int a){
		tic = true;
		
		if (b < 12) {
			b += a;
		} else {
			setBalance(getBalance() * Math.pow(1 + interest,b));
			tic = false;
		}
	}
	public double getWithdrawableAccount() {
			return getBalance();
		}
	public double EstimateValue (int month) {
		double b =0;
		b = getBalance() + getBalance()*month*interest;
		return b;
	}
	public String toString(){
		return String.format("SavingAccount_Balance : %f" , getBalance());
		}
	public double EstimateValue () {
		double b =0;
		b = getBalance() + getBalance()*1*interest;
		return b;
	}
	public void passTime(){
		tic = true;
	
		if (b < 12) {
			b += 1;
		} else {
			setBalance(getBalance() * Math.pow(1 + interest,b));
			tic = false;
		}
	}
}