package ch07;

public class TypeConversion {

	public static void main(String[] args)
	{
		// 묵시적 형변환(프로그래머 개입 없이 자동 형변환)과 명시적 형 변환(프로그래머가 강제적으로 type cast하는 것)이 있다.
		
		/*byte bNum = 10;
		int iNum = bNum;
		
		int iNum1 = 20;
		float fNum = iNum1;
		
		int iNum = 10;
		byte bNum = (byte)iNum;
		*/
		
		/* byte bNum = 125;
		int iNum = bNum;
		
		System.out.println(iNum);
		// 출력이 잘 된다.
		*/
		
		/*
		int iNum = 255;
		byte bNum = iNum;
		// 명시적 type cast가 필요하다. 왜 ? byte 가 출력할 수 있는 범위를 넘어섰기 때문이다.
		*/
		
		/*
		int iNum = 127;
		byte bNum = (byte)iNum;
		System.out.println(bNum);
		// 이상한 값이 나온
		*/
		
		/*
		double dNum = 3.14;
		int inum = dNum;
		//정밀한 수와 덜 정밀한 수가 되므로 오류가 난다.
		*/
		
		/*
		double dNum = 3.14;
		int inum = (int)dNum;
		
		System.out.println(inum);
		// 명시적 형 변환으로 출력. 하지만 데이터의 유실이 있음.
		
		 */
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum +(int)fNum; //강제 캐스팅
		int iNum2 = (int)(dNum + fNum); 
		
		System.out.println(iNum1); // 1 + 0
		System.out.println(iNum2); // (int)2.1
		
		
	}
}
