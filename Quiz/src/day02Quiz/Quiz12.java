package day02Quiz;

import java.util.Scanner;

public class Quiz12 {
 /*
  * dataType(조건)? 'data':'data';
  * 하나의 수를 입력 받고 삼항 연산자를 사용하여 양수인지 음수인지 판단하라.
  */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 하나를 입력해주세요 >");
		int userNumber = scanner.nextInt();
		
		String value = (userNumber < 0)? "음수입니다." : "양수입니다." ;
		System.out.println(value);
		
		scanner.close();
	}
}
