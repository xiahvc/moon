package test;


import java.util.Scanner;

public class test extends Account {
	public static void main(String[] args) {
		Account a = new Account();
		while(true) {
		System.out.println("계좌선택(1,2) : ");
		String first = new Scanner(System.in).nextLine();
		switch (first) {
		case "1":
		System.out.printf("1번 계좌를 선택하셨습니다.\n1. 입금 \n2. 출금\n3. 잔액확인\n");
		System.out.println("입력: ");
		String input = new Scanner(System.in).nextLine();
		switch (input) {
		case "1":
			System.out.println("얼마를 입금하시겠씁니까?\n입력: ");
			double input1 = new Scanner(System.in).nextDouble();
			a.account1 += input1; 
			System.out.printf("%f 원 을 입금하셨습니다.\n",input1);
		continue;
		case "2":
			System.out.println("얼마를 출금하시겠씁니까?\n입력: ");
			double input2 = new Scanner(System.in).nextDouble();
			a.account1 -= input2;
			System.out.printf("%f 원 을 출금하셨습니다.",input2);
		continue;
		case "3":
			System.out.printf("1번계좌의 현재 잔액은  %f입니다.",a.account1);
		continue;
		default:
		continue;
		}
		case "2":
		System.out.printf("2번 계좌를 선택하셨습니다.\n1. 입금 \n2. 출금\n3. 잔액확인\n");
		String input3 = new Scanner(System.in).nextLine();
		switch (input3) {
		case "1":
			System.out.println("얼마를 입금하시겠씁니까?\n입력: ");
			double input4 = new Scanner(System.in).nextDouble();
			a.account2 += input4; 
			System.out.printf("%f 원 을 입금하셨습니다.",input4);
		continue;
		case "2":
			System.out.println("얼마를 출금하시겠씁니까?\n입력: ");
			double input5 = new Scanner(System.in).nextDouble();
			a.account1 -= input5;
			System.out.printf("%f 원 을 출금하셨습니다.",input5);
		continue;
		case "3":
			System.out.printf("2번계좌의 현재 잔액은  %f입니다.",a.account2);
		continue;
		default:
		continue;
		}
		default:
		System.out.printf("프로그램 종료\n");
		continue;
		}
		
	}

}
}