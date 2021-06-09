package ch06;

public class LocalVariableType {

	public static void main(String[] args) {

		// 지역 변수 자료형 없이 사용하기.
		// local variable type inference. 
		// 변수의 종류가 여러가지가 있다.
		// 지역변수 = 블록 안({ })에서 사용되는 변수.
		// 또는 함수 안에서 사용하는 변수, 메인 함수의 매개변수 (parameter)로 쓰이는 변수를 말한다.
		
		var i = 10;
		var j = 10.0;
		var str = "Hello";
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test"; // hello를 test로 수정하는 것은 가능 
		//str = 3; 은 불가능 함 . 즉 다른 타입의 값을 대입하는 것은 불가능하다.
	}

}
