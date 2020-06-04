package day04Practice;

import java.util.Scanner;

public class Ex01while {
	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.println("숫자를 입력하세요(예:12345) >");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환
		
		while(num != 0) {
			sum += num%10;
			System.out.printf("sum=%3d num=%d\n", sum, num);
			System.out.println();
			num /= 10;
		}
		System.out.println("각 자리수의 합 : " + sum);
	}
}
