package variable_quiz;

public class Quiz02 {

	public static void main(String[] args) {
//		시험 성적이 90점 이상이면 'A'학점이고 평점은 4.0 입니다.
//		시험 성적이 80점 이상이면 'B'학점이고 평점은 3.0 입니다.
		
		int score = 90;
		char grade = 'A';
		double average = 4.0;
		System.out.println("시험 성적이 " + score + "점 이상이면 '" 
		+ grade + "' 학점이고 평점은 " + average + "입니다.");
		
		score = 80;
		grade = 'B';
		average = 3.0;
		System.out.println("시험 성적이 " + score + "점 이상이면 '" 
		+ grade + "' 학점이고 평점은 " + average + "입니다.");
		
		System.out.println();
		
//		int number1 = 33;
//		double number2 = 35.325;
//
//		출력 예시
//
//		두 수의 곱 : 1165.7250000000001
		
		int number1 = 33;
		double number2 = 35.325;
		
		System.out.println("두 수의 곱: " + (number1 * number2)); //산술 연산은 괄호
		
		double result = number1 * number2;
		System.out.println("두 수의 곱: " + result);
		
		System.out.println();
		
		
//		943 시간은 몇일 몇시간 인지 구하여 출력하세요.
//		출력 예시
//		943시간은 39일 7시간 입니다
		
		int hour = 943;
		int d = hour / 24;
		int h = hour % 24;
		
		
		System.out.println(hour + "시간은 " + d + "일 " + h + "시간 입니다"); //time 나누기 24 몫과 나머지 구하기
		
		System.out.println();
	
	
	
//	가로 길이 8, 세로 길이 9인 사각형과 삼각형의 넓이를 각각 구하여 출력하세요.
//	넓이는 직접 계산하지 말고, 컴퓨터에게 양보하세요.
//
//	출력 예시
//	사각형의 넓이: 72 밑변 * 높이
//	삼각형의 넓이: 36 밑 변 * 높이 /2
	
	int width = 8;
	int height = 9;
	int rectangleArea = width * height;
	int triangleArea = rectangleArea /2;
	
	System.out.println("사각형의 넓이: " + rectangleArea);
	System.out.println("삼각형의 넓이: " + triangleArea);
	}

}
