package variable_ex;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * 여러줄
		 * 주석
		 * */
		
		// 정수형 변수(Integer)
		int number = 10; //변수에 값을 '초기화' 한다.
		System.out.println(number);
		
		number = 5; //변수이므로 값을 변경 가능. 재사용시 자료형 생략
		System.out.println(number);
		
		int number2 = 100;
		int sum = number + number2;
		System.out.println(sum);
		
		// 변수에 값을 저장한다. 할당한다. 대입한다. assign 한다.
		
		// 실수 변수 (Float) : 권장 안함. 오차가 있을 수 있다.
		float f = 1.555555555f;
		System.out.println(f);
		
		// 실수 변수 (Double) : 권장
		double d = 3.888888888888;
		System.out.println(d * number);
		
		// 문자 변수 (Character) : 문자 한개. 작은 따옴표로 감싼다.
		char c = 'a';
		System.out.println(c);
		
		// boolean 변수 : 참(true), 또는 거짓(false)
		boolean isReal = true;
		System.out.println(isReal);
		boolean isFalse = false;
		System.out.println("거짓이다 " + isFalse);
	}

}
