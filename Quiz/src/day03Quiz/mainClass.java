package day03Quiz;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		// 1 ~ 1000 사이에 수를 전부 합친 값을 출력하라.
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
		System.out.println("합계:" + sum);
		*/
		
		// 하나의 수를 입력 받고 10의 배수로 입력 받은 수는 어느 범위에 있는지 출력되는
		// 프로그램을 작성하라.
		/*
		int number;
		
		System.out.print("숫자입력 = ");
		number = sc.nextInt();
		*/
		/*
		if(number > 0 && number <= 10) {
			System.out.println("number는 0 보다 크고 10보다 작거다 같다");
		}
		else if(number > 10 && number <= 20) {
			System.out.println("number는 10 보다 크고 20보다 작거다 같다");
		}
		*/
		/*
		int n = 0;
		for (int i = 0; i < 10; i++) {
			n = 10 * i;	// 0 10 20 30... 90
			if(number > n && number <= (n + 10)) {
				System.out.println("number는 " + n + "보다 크고 " + (n + 10) + "보다 작거다 같다");
			}
		}
		*/
		
		// 1 ~ 100 사이에 짝수의 합과 홀수의 합을 각각 출력하도록 작성하라.
		/*
		int sum1, sum2;
		
		sum1 = sum2 = 0;
		
		for(int i = 1;i <= 100; i++) {
			if(i % 2 == 1) {	// 홀수
				sum1 = sum1 + i;
			}else {				// 짝수
				sum2 = sum2 + i; 
			}
		}
		System.out.println("홀수의 합:" + sum1);
		System.out.println("짝수의 합:" + sum2);
		*/
		
		// 구구단을 1단부터 9단까지 출력하는 프로그램을 작성하라.
		/*
		for(int i = 1;i <= 10; i++) {			
			for(int j = 1;j <= 10; j++) {				
				System.out.print(i + " x " + j + " = " + (i * j) + " ");				
			}			
			System.out.println();			
		}
		*/
		
		/*
		// 임의 수를 입력 받고 그 해당하는 수의 구구단을 출력하는 프로그램을 작성하라.
		System.out.print("출력하고 싶은 구구단 = ");
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
//		System.out.print("첫번째 수 = ");
//		num1 = sc.nextInt();
//		
//		System.out.print("(+, -, *, /) = ");
//		oper = sc.next();
//		
//		System.out.print("두번째 수 = ");
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










