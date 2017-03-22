package test;

import java.util.Scanner;

public class Accounttest {
	public static void main(String[] args) {
		Account b = new Account(100);
		Account a = new Account(100);

		System.out.printf("Account1 balance : %s\nAccount2 balance : %s", a.getBalance(), b.getBalance());
		System.out.print("\nEnter deposit amount for Account1: ");
		Scanner input =new Scanner(System.in);
		double c = input.nextDouble();
		a.balance = c + a.getBalance(); 

		System.out.printf("Account1 balance : %s\nAccount2 balance : %s", a.getBalance(), b.getBalance());
		System.out.print("\nEnter withdrawal amount for Account2: ");
		Scanner input1 =new Scanner(System.in);
		double d = input.nextDouble();
		b.balance = d - b.getBalance(); 
		
		System.out.printf("Account1 balance : %s\nAccount2 balance : %s", a.getBalance(), b.getBalance());
		
		System.out.printf("\nnext month!\nAccount1 balance : \nAccount2 balance : ");
	}
}