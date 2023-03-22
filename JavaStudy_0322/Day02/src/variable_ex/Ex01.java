package variable_ex;

public class Ex01 {

	public static void main(String[] args) {
		int noodleCup = 850;
		System.out.println("육개장 가격: " + noodleCup);
		
		//3개 가격 계산
		//육개장 가격 : 850, 3개의 가격 :2550
		int sum = noodleCup * 3;
		System.out.println("육개장 가격 : " + noodleCup + ", 3개의 가격: " + sum);
		
		//10,000으로 육개장 3개를 산 후 거스름돈
		int money = 10000;
		int change = money - sum;
		System.out.println("거스름돈 :" + change);
		
		//5,000원으로 육개장 몇 개를 살 수 있고, 거스름돈은?
		money = 5000;
		int buyNoodleCup = money / noodleCup;
		System.out.println("살 수 있는 개수: " + buyNoodleCup);
		
		//나머지: %
		change = money % noodleCup;
		System.out.println("거스름돈: " + change);
	}

}
