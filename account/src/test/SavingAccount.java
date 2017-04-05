package test;

public class SavingAccount extends Account implements Valuable {
	double interest;
	int b = 0;
	boolean tic = false;
	
	SavingAccount(double balance,double interest) {
		super(balance);
		this.interest = interest;
	}
	
	public void debit(double d){
		if (tic == true) {
			System.out.println("��������Ҽ������ϴ�!");
			
		} else{
			setBalance(getBalance() - d);
		}
	}
	//�߻�޼ҵ屸��
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
	}