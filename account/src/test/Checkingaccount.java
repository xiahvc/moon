package test;

public class Checkingaccount extends Account {
	double credit_limit , interest , loan_interest;
	Checkingaccount(double balance, double credit_limit, double interest, double loan_interest) {
	super(balance);
	this.credit_limit = 500;
	this.interest = 0.1f;
	this.loan_interest = 0.07f;
	}
	

	public void debit() {
		//if (a.a1 == 0 || a.a2 == 0){
			System.out.println("출금불가");
		}
	public void nextMonth() {
		
	}
	
}