package day02;

public class Ex01Operator {
	public static void main(String[] args) {
//		��� ������
		int num1, num2;
		int result; // ���

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
//		����������
		int number = 0;
		number = number + 1; // �ڱ� �ڽ��� ���� ����
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
		tag = ++number; //number = 3 tag = 3 // number ���� ���� 
		System.out.println("number = " + number);
		System.out.println("tag = " + tag);
		
		tag = number++; //number = 4 tag = ���߿� ���� -> 3
		System.out.println("number = " + number);
		System.out.println("tag = " + tag);
		
		tag = number++; //number = 5 tag ���߿� ���� -> = 4
		System.out.println("number = " + number);
		System.out.println("tag = " + tag);
		
		tag = ++number; //number = 6 tag = 6 // number ���� ����
		System.out.println("number = " + number);
		System.out.println("tag = " + tag);
		
//		------------
//		
		
		
		
	}

}
