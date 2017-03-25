package odd;
import java.util.Scanner;

public class odd {
	public static void main(String[] args) {
		System.out.print("Enter 1st Number : ");
		Scanner input = new Scanner(System.in);
		int Num1 = input.nextInt();
		System.out.print("eNTER 2ND nUMBER : ");
		Scanner input2 = new Scanner(System.in);
		int Num2 = input.nextInt();
		int sum = Num1 + Num2;
			System.out.printf("°á°ú : %d", sum);
	}
}