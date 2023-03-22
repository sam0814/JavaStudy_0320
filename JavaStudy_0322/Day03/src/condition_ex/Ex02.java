package condition_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 두 개의 수를 입력받고 비교하기
		System.out.print("두 개의 수를 입력하세요: ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();

		// number1이 number2 보다 크다
		if (number1 > number2) {
			System.out.println("number1이 number2 보다 크다");
		}

		// number1이 number2 보다 작다
		if (number1 < number2) {
			System.out.println("number1이 number2 보다 작다");
		}

		// number1과 number2는 같다
		if (number1 == number2) {
			System.out.println("number1과 number2는 같다");
		}

		//ctrl + shift + f =>정렬
		
		// number1과 number2는 같지 않다
		if (number1 != number2) {
			System.out.println("number1과 number2는 같지 않다");
		}

		scan.close();
	}

}
