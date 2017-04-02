package test;

public class SavingAccount extends Account {
	double interest;
	int b = 0;
	boolean tic = false;
	
	SavingAccount(double balance,double interest) {
		super(balance);
		this.interest = interest;
	}
	
	public void debit(double d){
		if (tic == true) {
			System.out.println("아직출금할수없습니다!");
			
		} else{
			setBalance(getBalance() - d);
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
	}