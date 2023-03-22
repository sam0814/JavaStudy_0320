package condition_ex;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 논리 연산자 (그리고, 또는)
		System.out.print("숫자를 입력하세요: ");
		int number = scan.nextInt();
		
		//number가 10 이상이고 40 이하이다. (그리고, AND) 10 <= number <= 40
		if (number >= 10 && number <= 40) {
			System.out.println("number가 10 이상이고 40 이하이다.");
		}
		
		//number가 10보다 작거나 40보다 크다. (또는, OR) number < 10 또는 number > 40
		if (number < 10 || number > 40) {
			System.out.println("number가 10보다 작거나 40보다 크다.");
		}
		
		
		
		
		
	}

}
