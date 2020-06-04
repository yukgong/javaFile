package day02;

public class Ex03BitClass {
	public static void main(String[] args) {
		//비트 연산자(Bit Operator)
		
		//AND
		int result;
		result = 0xAC & 0xF0;
		System.out.println("result = " + result);
		System.out.printf("0x%x\n", result);
		
		//OR
		result = 0x48 | 0xB4;
		System.out.println("result = " + result);
		System.out.printf("0x%x\n", result);
		
		//XOR
		result = 0xC4 ^ 0x78;
		System.out.println("result = " + result);
		System.out.printf("0x%x\n", result);
		
		//반전(~)
		byte by = ~0x55;
		System.out.printf("0x%x\n", by);
		
		//LEFT SHIFT(*2)
		byte by1;
		by1 = 0x1 << 1;
		System.out.printf("0x%x\n", by1);
		
		by1 <<= 1;
		System.out.printf("0x%x\n", by1);
		
		by1 <<= 1;
		System.out.printf("0x%x\n", by1);
		
		//RIGHT  SHIFT(/2)
		by1 >>= 1;
		System.out.printf("0x%x\n", by1);
		
		by1 >>= 1;
		System.out.printf("0x%x\n", by1);
		
		/*
		 * num1 = 0x12
		 * num2 = 0x34
		 * number = ~(num1 & ~num2)
		 * 
		 * 12
		 * 1    2
		 * 0001 0010
		 * 
		 * 34
		 * 3    4
		 * 0011 0100
		 * ~ -> 1100 1011
		 * 
		 * 0001 0010
		 * 1100 1011
		 * ---------
		 * 0000 0010 -> 2
		 * ~ -> 1111 1101
		 * 
		 * 
		 * 15 13
		 * FD -> 253
		 * 
		 * 
		 */
		

		byte number = ~(0x12 & ~0x34);

		System.out.println(number);
		System.out.printf("0x%x\n", number);
		
		
		
	}
}
