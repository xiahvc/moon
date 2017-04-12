package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Accounttest {
	public static void main(String[] args) {
		Account account1 = new Checkingaccount(100,50,0.01,0.07);
		Account account2 = new SavingAccount(100,0.05);
		
		//Checkingaccount
		Scanner scan = new Scanner(System.in);
		double amount;
		
		try {
		System.out.println("\nEnter deposit amount for Account1: ");
		amount = scan.nextDouble();
		account1.debit(amount);
		System.out.printf("Account1 balance : $" + account1.getBalance());

		System.out.println("\nEnter deposit amount for Account2: ");
		amount = scan.nextDouble();
		account2.debit(amount);
		System.out.printf("Account2 balance : $" + account2.getBalance());
		} catch (InputMismatchException e) {
			System.out.println("���ܹ߻� : ���ڸ� �Է��ϼ���\n" + e.toString());
		} catch (Exception e) {
			System.out.println("���ܹ߻�   " +e.toString());
		} finally {
			account1.passTime(2);
			System.out.println("2 month later account1 : "+ account1.getBalance());
		}
		
	}
}