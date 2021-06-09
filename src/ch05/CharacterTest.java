package ch05;

public class CharacterTest {

	public static void main(String[] args)
	{
		//문자 출력 방법 
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		// 1. char 'A'로 받아서 그대로 출력 및 int 형 출력 
		
		char ch2 = 66;
		System.out.println(ch2);
		
		// 2. char = 66; 으로 받아서 그대로 출력
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		// 3. int 형 67로 받아서 char 형으로 출력 
		
		// 4. char ch4 = -66; //음수는 출력이 되지 않습니다 !!
		
		char ch5 = '한';
		char ch6 = '\uD55C';
		
		System.out.println(ch5);
		System.out.println(ch6);
		// 5. '한' = '\uD55C' 와 같음을 알 수 있다.		 
	}
}
