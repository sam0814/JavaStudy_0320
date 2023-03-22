package variable_quiz;

public class Quiz03 {

	public static void main(String[] args) {
//		평균 구하기
//		아래와 같이 점수가 주어졌을 때 평균을 구해서 출력하세요.
//		평균은 소수 둘째자리 까지만 출력하세요.
//		국어 : 93 수학 : 88 영어 : 94
//		출력 예시
//
//		국어 93점, 수학 88, 영어 94점
//		평균: 91.67
		
//		double korean = 93.0;
//		double math = 88.0;
//		double english = 94.0;
//		double average = (korean + math + english)/3;
//		System.out.println("국어: " + (int)korean + "점, 수학 " + (int)math + "점, 영어: " + (int)english + "점");
//		System.out.println("평균: " + average) ;
		
		int korean = 93;
		int math = 88;
		int english = 94;
		double average = (double)(korean + math + english) / 3; //또는 3.0 double(3)
		average = Math.round(average * 100) / 100.0;
		System.out.println("국어: " + korean + "점, 수학: " + math + "점, 영어: " + english + "점");
		System.out.println("평균: " + average);
		
		
//		화씨 구하기
//		아래 공식을 이용해서 섭씨 30도의 화씨 온도를 출력하세요.
//		화씨 온도 = 9 / 5 * 섭씨온도 + 32
//
//		출력 예시
//
//		섭씨 30도는 화씨 86.0도 입니다.
		
//		int celsius = 30;
//		int fahrenheit = 9 / 5 * celsius + 32;
		
		
		int c = 30; //섭씨
		double f = 9 / (double)5 * c + 32;
		System.out.println("섭씨 " + c + "도는 화씨 " + f + "도 입니다.");
	}

}
