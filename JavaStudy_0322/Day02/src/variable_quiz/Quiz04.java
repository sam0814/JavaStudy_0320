package variable_quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
//		두 수를 입력 받아서 몫과 나머지를 출력하세요.
//		입력 예시
//
//		입력1 : 843
//		입력2 : 8
//		출력 예시
//
//		몫 : 105 나머지 : 3
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("입력1 : ");
//		int input1 = scan.nextInt();
//		System.out.println("입력2: ");
//		int input2 = scan.nextInt();
//		System.out.println();
//		
//		System.out.println("몫 : " + input1 / input2 + "나머지 : " + input1 % input2);
		
		
//		수 두개를 x, y 에 입력 받아서 바꿔서 출력하세요.
//		입력 예시
//
//		x : 6
//		y : 4
//		출력 예시
//
//		x는 4이고, y는 6 입니다.
		
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("x : ");
//		int x = scan.nextInt();
//		System.out.print("y : ");
//		int y = scan.nextInt();
//		
//		System.out.println("x는 " + y + "이고," + " y는 " + x + "입니다.");
		
		
//		초를 입력 받아서 ?분?초 형태로 출력 하세요.
//				입력 예시
//
//				초 : 464
//				출력 예시
//
//				7분 44초
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("초: ");
//		int time = scan.nextInt();
//		
//		int min = time/60;
//		int sec = time%60;
//		System.out.println(min + "분 " + sec + "초");
		
		
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
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("입력: " );
//		int number = scan.nextInt();
//		
//		System.out.println(number / 1000);
//		System.out.println((number % 1000) / 100);
//		System.out.println((number % 100) / 10);
//		System.out.println((number % 10) / 1);
		
		
//		네 자리수를 입력 받아서 각 자리수의 합을 출력하세요.
//		입력 예시
//
//		입력 : 1234
//		출력 예시
//
//		합계는 10 입니다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");
		int number = scan.nextInt();
		
		System.out.println("합계는 " + (number / 1000 + (number % 1000) / 100 + (number % 100) / 10 + (number % 10) / 1) + "입니다.");
		
		
	}

}
