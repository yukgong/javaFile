package day02Quiz;

public class Quiz11 {
	public static void main(String[] args) {
		/*
		 * int num1, num2;
		 * 
		 * num1 = 128; num2 = 56;
		 * 
		 * 16������ �ٲ۴�.
		 * num 1 = 80;
		 * num 2 = 38;
		 * 
		 * 8    0
		 * 1000 0000
		 * 
		 * 3    8
		 * 0011 1000
		 * 
		 * 
		 * &�� �Ѵ� 1, |�� �ϳ��� 1, ^�� �ΰ� ���ؼ� �ٸ��� 1, ~�� ����
		 * num1 & num2 -> 0000 0000 -> 0
		 * num1 = (num1 & num2) | (num1 & num2) = 0
		 * 
		 * num1 = 0000 0000
		 * num1 ^ num2 = 0011 1000
		 * ~(num1 ^ num2) = 1100 0111 -> 12 7 - C7
		 * num2 = C7
		 */

		int num1, num2;

		num1=128;
		num2=56;
		
		System.out.printf("0x%x\n",num1);
		System.out.printf("0x%x\n",num2);
		
		num1 = (num1 & num2) | (num1 & num2);
		num2 = ~(num1 ^ num2);
		
		
		
		System.out.printf("0x%x\n",num1);
		System.out.printf("0x%x\n",num2);
		
		System.out.println(num1);
		System.out.println(num2);
		
		
	}


}
