package day02Practice;

import java.util.Scanner;

public class Ex01ThreeOperator {
	public static void main(String[] args) {
		//����ڿ��� ���� �Է¹޾� Ȧ�� ¦�� ���ϱ� 
		
		//��ĳ�� ��ȯ
		Scanner scanner = new Scanner(System.in);
		
		//����ڿ��� ���� �Է¹ޱ�
		System.out.println("���� �ϳ��� �Է����ּ��� :");
		int userNumber = scanner.nextInt(); // �Է¹��� �� userNumber�� ����
		
		// Ȧ������ ¦������ ���ϱ� ���� ����ڿ��� �Է¹��� ���� �������� ���� �������� 0���� 1���� ���� ���Ѵ�.
		userNumber = userNumber%2;
		
		// ������� 0�̸� ¦�� 1�̸� Ȧ���̴� ����ڰ� �Է��� ���� 0�̸� true�̴� "¦���Դϴ�."�� ����ϰ�, 
		//1�̸� false�̴� "Ȧ���Դϴ�."�� ����Ѵ�.
		String result = (userNumber == 0)? "¦���Դϴ�." : "Ȧ���Դϴ�.";
		// dataType name = (����)? 'true' : 'false'; 
		
		//result�� ��� ���� ��µǵ��� �Ѵ�.
		System.out.println(result);
	}
}
