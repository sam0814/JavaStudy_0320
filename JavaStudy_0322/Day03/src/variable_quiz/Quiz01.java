package variable_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
//		두 수를 입력 받아서 몫과 나머지를 출력하세요.
//		입력 예시
//
//		입력1 : 843
//		입력2 : 8
//		출력 예시
//
//		몫 : 105 나머지 : 3
		
		Scanner scan = new Scanner(System.in);
		
		//1
//		System.out.print("입력1: ");
//		int number1 = scan.nextInt();
//		System.out.print("입력2: ");
//		int number2 = scan.nextInt();
//		
//		int quotient = number1 / number2;
//		int remainder = number1 % number2;
//		
		//		몫 : 105 나머지 : 3
//		System.out.println("몫: " + quotient + " 나머지: " + remainder);
	
		//2
//		수 두개를 x, y 에 입력 받아서 바꿔서 출력하세요.
//		입력 예시
//
//		x : 6
//		y : 4
//		출력 예시
//
//		x는 4이고, y는 6 입니다.
		
//		System.out.print("x: ");
//		int x = scan.nextInt(); //6
//		System.out.print("y: ");
//		int y = scan.nextInt(); //4
//		System.out.println("x는 " + y + " y는 " + x);
//		
		// 교체(swap) 알고리즘
//		
//		
		/*
		 * int x = 6;
		 * int y = 4;
		 * int temp = 6;
		 * 
		 * x = y;
		 * y = temp;
		 *  */
		
//		int temp = x;
//		x = y;
//		y = temp;
//		System.out.println("x는 " + x + " y는 " + y);
		
		
		//3
//		초를 입력 받아서 ?분?초 형태로 출력 하세요.
//				입력 예시
//
//				초 : 464
//				출력 예시
//
//				7분 44초
		
//		System.out.print("초: ");
//		int seconds = scan.nextInt();
//		
//		//분, 초
//		int min = seconds / 60;
//		int sec = seconds % 60;
//		
//		System.out.println(min + "분 " + sec + "초");
		
		
		//4
//		네 자리수 숫자를 입력 받아서 천의 자리부터 한줄씩 출력 하세요.
//		입력 예시
//
//		입력 : 1234
//		출력 예시
//
//		1
//		2
//		3
//		4
		
		System.out.print("입력: ");
		int number = scan.nextInt(); //1234
		// 1234 / 1000 => 1.234 몫:1 나머지:234
		// 234 / 100 => 2.34 몫:2 나머지:34
		// 34 / 10 => 3.4 몫:3 나머지:4
		
//		int q = number / 1000;    //1
//		int r = number % 1000;    //234
//		System.out.println(q);    //1
//		
//		q = r / 100; //2
//		r = r % 100; //34
//		System.out.println(q); //2
//		
//		q = r / 10; //3
//		r = r % 10; //4
//		System.out.println(q); //3
//		System.out.println(r); //4
		
		//5
		// 1234 / 1000 => 1.234 몫:1 나머지:234
		// 234 / 100 => 2.34 몫:2 나머지:34
		// 34 / 10 => 3.4 몫:3 나머지:4
		
		int n1 = number / 1000; //1234 / 1000 => 1
		int n2 = (number % 1000) / 100; //234 / 100 => 2
		int n3 = (number % 100) / 10; //34 / 10 => 3
		int n4 = number % 10; //4
		int sum = n1 + n2 + n3 + n4;
		System.out.println("합계는 " + sum + " 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		scan.close(); //경고창
	}

}
 