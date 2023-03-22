package variable_ex;

public class Ex02 {

	public static void main(String[] args) {
//		// 자료형 (Data Type) 변환 => casting
		double pi = 3.14;
		int intpi = (int)pi; //double -> int변환: 소수점 뒷자리값 버림
		System.out.println(intpi);
		
		System.out.println((int)pi);
		
		int number = 7;
		double result = number / 2; //예상 값: 3.5 결과: 3.0  int/int => int
		System.out.println(result);
	
		// 1. 둘 중 하나의 값을 소수로 캐스팅 한다.
		result = (double)number / 2;
		System.out.println(result);
		
//		// 2. 소수 값으로 나눈다.
		result = number / 2.0;
		System.out.println(result);
		
		
		// 반올림 하는 법
//		 Math.round(실수값) 3.14 => 3   3.82123 => 4 
		pi = 3.641592653;
		
		System.out.println(Math.round(pi));
		
		// 둘째 자리까지 반올림 해서 나타내는 방법
		// 1. pi값에 100을 곱해서 314.1592653으로 만든다.
		// 2. round 함수를 이용해서 소수점 첫째자리에서 반올림하고 정수로 만든다. => 314
		// 3. 3.14로 만들기 위해 100.0을 나누어준다. (.0 을 붙이지 않으면 정수형으로 인식에 소수점 뒷자리가 날라감)
		System.out.println(Math.round(pi * 100) / (double)100); //또는 100.0
	}

}
