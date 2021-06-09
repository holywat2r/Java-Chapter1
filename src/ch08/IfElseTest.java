package ch08;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args)
	{
		/*psude-code
		 * '재산이 1억원 이상이면 100만원을 세금으로 낸다. 그렇지 않으면 내지 않는다.'
		 * 구현
		 * 만약에(재산이 1억원 이상이면){
		 * 	세금을 100만원 낸다;
		 * }
		 * 그렇지 않다면 {
		 * 	세금을 내지 않는다.;
		 * }
		 * 
		 * if(조건식)
		 *	수행문; // 조건식이 참인 경우에 수행문이 수행됨
		 *
		 * if(조건식)
		 * 	수행문 1; // 조건식이 참인 경우에 수행
		 * }
		 * else{
		 * 	수행문 2; // 조건식이 참이 아닌 경우에 수
		 * }
		 */
		
		int age = 7;
		// Scanner scanner = new Scanner(System.in);
		// int age = scanner.nextInt();
		
		if(age >= 8) {
			System.out.println("학교에 다닙니다");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
	}
}
