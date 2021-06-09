package ch07;

public class ConstantTest {

	public static void main(String[] args) {

		// 상수는 변하지 않는 수.
		// 상수를 사용하면 변하지 않는 값을 반복하여 사용할 때 의미있는 문자로 인식하기 쉽다.
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0; // 한번 초기화를 하면 바꿀 수 없고 선언 후 꼭 초기화를 해 주어야 한다.
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		// MAX_NUM = 1000; 로 수정이 불가능하다.
	}

}
