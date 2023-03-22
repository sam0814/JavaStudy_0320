package variable_ex;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//입력하기
		// ctrl + shift + o
		Scanner scan = new Scanner(System.in);
		
		System.out.print("육개장 가격을 입력하세요: ");
		int noodleCup = scan.nextInt(); //숫자를 입력 받는다.
		System.out.println("육개장 가격은 " + noodleCup + "원");
		
		System.out.print("육개장의 개수를 입력하세요: ");
		int count = scan.nextInt();
		int total = noodleCup * count;
		// 육개장 n개의 가격은 00원
		System.out.println("육개장 " + count + "개의 가격은 " + total + "원");
	}

}
