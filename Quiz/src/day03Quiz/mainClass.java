package day03Quiz;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		// 1 ~ 1000 ���̿� ���� ���� ��ģ ���� ����϶�.
		int sum;
		int num;		
		// initialize
		sum = 0;
		num = 1;			
		// processing
		for(int i = 0;i < 1000; i++) {
			sum = sum + num;
			num = num + 1; 
		}		
		// printing
		System.out.println("�հ�:" + sum);
		*/
		
		// �ϳ��� ���� �Է� �ް� 10�� ����� �Է� ���� ���� ��� ������ �ִ��� ��µǴ�
		// ���α׷��� �ۼ��϶�.
		/*
		int number;
		
		System.out.print("�����Է� = ");
		number = sc.nextInt();
		*/
		/*
		if(number > 0 && number <= 10) {
			System.out.println("number�� 0 ���� ũ�� 10���� �۰Ŵ� ����");
		}
		else if(number > 10 && number <= 20) {
			System.out.println("number�� 10 ���� ũ�� 20���� �۰Ŵ� ����");
		}
		*/
		/*
		int n = 0;
		for (int i = 0; i < 10; i++) {
			n = 10 * i;	// 0 10 20 30... 90
			if(number > n && number <= (n + 10)) {
				System.out.println("number�� " + n + "���� ũ�� " + (n + 10) + "���� �۰Ŵ� ����");
			}
		}
		*/
		
		// 1 ~ 100 ���̿� ¦���� �հ� Ȧ���� ���� ���� ����ϵ��� �ۼ��϶�.
		/*
		int sum1, sum2;
		
		sum1 = sum2 = 0;
		
		for(int i = 1;i <= 100; i++) {
			if(i % 2 == 1) {	// Ȧ��
				sum1 = sum1 + i;
			}else {				// ¦��
				sum2 = sum2 + i; 
			}
		}
		System.out.println("Ȧ���� ��:" + sum1);
		System.out.println("¦���� ��:" + sum2);
		*/
		
		// �������� 1�ܺ��� 9�ܱ��� ����ϴ� ���α׷��� �ۼ��϶�.
		/*
		for(int i = 1;i <= 10; i++) {			
			for(int j = 1;j <= 10; j++) {				
				System.out.print(i + " x " + j + " = " + (i * j) + " ");				
			}			
			System.out.println();			
		}
		*/
		
		/*
		// ���� ���� �Է� �ް� �� �ش��ϴ� ���� �������� ����ϴ� ���α׷��� �ۼ��϶�.
		System.out.print("����ϰ� ���� ������ = ");
		int googoo = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {			
			System.out.println(googoo + " x " + i + " = " + (googoo * i));
		}
		*/
		
		/*
		
		*****
		*****
		*****
		*****
		*****
		*****
		*****
		*****
		***** 
		
		 */
		
		/*
		for(int j = 0;j < 9; j++) {
			for(int i = 0;i < 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
		
		*
		**
		***
		****
		*****
		****
		***
		**
		*
		 
		*/
		/*
		int n = 0;
		for(int j = 0;j < 9; j++) {	// 0 ~ 8
			
			if(j < 5) n = n + 1;
			else	  n = n - 1;			
			for(int i = 0;i < n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
		
		**
		*
		***
		*****
		*
		****
		
		*/
		
		/*
		int stars[] = { 2, 1, 3, 5, 1, 4 };
		for(int j = 0;j < 6; j++) {
			
			for(int i = 0;i < stars[j]; i++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		*/
		
//		int num1, num2;
//		String oper;	// + - * /
//		int result = 0;
//		
//		System.out.print("ù��° �� = ");
//		num1 = sc.nextInt();
//		
//		System.out.print("(+, -, *, /) = ");
//		oper = sc.next();
//		
//		System.out.print("�ι�° �� = ");
//		num2 = sc.nextInt();
//		
//		switch( oper ) {
//			case "+":
//				result = num1 + num2;
//				break;
//			case "-":
//				result = num1 - num2;
//				break;
//			case "*":
//				result = num1 * num2;
//				break;
//			case "/":
//				result = num1 / num2;
//				break;
//		}
//		
//		System.out.println(num1 + " " + oper + " " + num2 + " = " + result);
//		
		
	}

}










