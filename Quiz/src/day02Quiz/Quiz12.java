package day02Quiz;

import java.util.Scanner;

public class Quiz12 {
 /*
  * dataType(����)? 'data':'data';
  * �ϳ��� ���� �Է� �ް� ���� �����ڸ� ����Ͽ� ������� �������� �Ǵ��϶�.
  */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �ϳ��� �Է����ּ��� >");
		int userNumber = scanner.nextInt();
		
		String value = (userNumber < 0)? "�����Դϴ�." : "����Դϴ�." ;
		System.out.println(value);
		
		scanner.close();
	}
}
