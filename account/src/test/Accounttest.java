package test;

import java.util.Scanner;

public class Accounttest {
	public static void main(String[] args) {
		Checkingaccount a = new Checkingaccount();
		Checkingaccount b = new Checkingaccount();

		System.out.printf("Account1 balance : %s\nAccount2 balance : %s", a.getBalance(), b.getBalance());
		System.out.print("\nEnter deposit amount for Account1: ");
		Scanner input =new Scanner(System.in);
		double c =input.nextDouble();
		a.credit(c);

		System.out.printf("Account1 balance : %s\nAccount2 balance : %s", a.getBalance(), b.getBalance());
		System.out.print("\nEnter withdrawal amount for Account2: ");
		Scanner input1 =new Scanner(System.in);
		double d = input.nextDouble();
		b.debit(d); 
		
		System.out.printf("Account1 balance : %s\nAccount2 balance : %s", a.getBalance(), b.getBalance());
		
		System.out.printf("\nnext month!\nAccount1 balance : %s\nAccount2 balance : %s",a.nextMonth(),b.nextMonth());
	}
}