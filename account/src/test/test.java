package test;


import java.util.Scanner;

public class test extends Account {
	public static void main(String[] args) {
		Account a = new Account();
		while(true) {
		System.out.println("���¼���(1,2) : ");
		String first = new Scanner(System.in).nextLine();
		switch (first) {
		case "1":
		System.out.printf("1�� ���¸� �����ϼ̽��ϴ�.\n1. �Ա� \n2. ���\n3. �ܾ�Ȯ��\n");
		System.out.println("�Է�: ");
		String input = new Scanner(System.in).nextLine();
		switch (input) {
		case "1":
			System.out.println("�󸶸� �Ա��Ͻðھ��ϱ�?\n�Է�: ");
			double input1 = new Scanner(System.in).nextDouble();
			a.account1 += input1; 
			System.out.printf("%f �� �� �Ա��ϼ̽��ϴ�.\n",input1);
		continue;
		case "2":
			System.out.println("�󸶸� ����Ͻðھ��ϱ�?\n�Է�: ");
			double input2 = new Scanner(System.in).nextDouble();
			a.account1 -= input2;
			System.out.printf("%f �� �� ����ϼ̽��ϴ�.",input2);
		continue;
		case "3":
			System.out.printf("1�������� ���� �ܾ���  %f�Դϴ�.",a.account1);
		continue;
		default:
		continue;
		}
		case "2":
		System.out.printf("2�� ���¸� �����ϼ̽��ϴ�.\n1. �Ա� \n2. ���\n3. �ܾ�Ȯ��\n");
		String input3 = new Scanner(System.in).nextLine();
		switch (input3) {
		case "1":
			System.out.println("�󸶸� �Ա��Ͻðھ��ϱ�?\n�Է�: ");
			double input4 = new Scanner(System.in).nextDouble();
			a.account2 += input4; 
			System.out.printf("%f �� �� �Ա��ϼ̽��ϴ�.",input4);
		continue;
		case "2":
			System.out.println("�󸶸� ����Ͻðھ��ϱ�?\n�Է�: ");
			double input5 = new Scanner(System.in).nextDouble();
			a.account1 -= input5;
			System.out.printf("%f �� �� ����ϼ̽��ϴ�.",input5);
		continue;
		case "3":
			System.out.printf("2�������� ���� �ܾ���  %f�Դϴ�.",a.account2);
		continue;
		default:
		continue;
		}
		default:
		System.out.printf("���α׷� ����\n");
		continue;
		}
		
	}

}
}