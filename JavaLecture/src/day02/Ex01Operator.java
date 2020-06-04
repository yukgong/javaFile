package day02;

public class Ex01Operator {
	public static void main(String[] args) {
//		산술 연산자
		int num1, num2;
		int result; // 결과

		num1 = 3;
		num2 = 1;

		result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
		
		result = num1 * num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
		
		result = num1 / num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
		
		result = num1 % num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
		
//		-----------
//		증감연산자
		int number = 0;
		number = number + 1; // 자기 자신의 값을 갱신
		number += 1;
		System.out.println(number);
		
		number++; // number = number + 1;
		System.out.println(number);
		++number;
		System.out.println(number);
		
		number--;
		System.out.println(number);
		--number;
		System.out.println(number);
		
		int tag;
		tag = ++number; //number = 3 tag = 3 // number 먼저 증가 
		System.out.println("number = " + number);
		System.out.println("tag = " + tag);
		
		tag = number++; //number = 4 tag = 나중에 증가 -> 3
		System.out.println("number = " + number);
		System.out.println("tag = " + tag);
		
		tag = number++; //number = 5 tag 나중에 증가 -> = 4
		System.out.println("number = " + number);
		System.out.println("tag = " + tag);
		
		tag = ++number; //number = 6 tag = 6 // number 먼저 증가
		System.out.println("number = " + number);
		System.out.println("tag = " + tag);
		
//		------------
//		
		
		
		
	}

}
