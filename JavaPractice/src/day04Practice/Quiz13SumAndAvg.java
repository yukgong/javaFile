package day04Practice;

import java.util.Scanner;

public class Quiz13SumAndAvg {
	public static void main(String[] args) {
		
		//�ݺ��ϱ�
		while(true) {
			//���� ����
			int sum = 0;
			int avg = 0;
			
			//�����ϰ� ���� ������ ���� �Է��ϱ�
			Scanner scanner = new Scanner(System.in);
			System.out.println("���ڸ� �Է��ϼ��� > ");
			int arrNum = scanner.nextInt();
			
			//�迭 ���� �Ҵ�
			int arr[] = new int[arrNum];
			
			//�����ϰ� ���� ���� ������ �°� ���� �Է� �ޱ�
			for(int i = 0; i < arr.length; i++) {
				System.out.println((i+1) + "��° ���ڸ� �Է��ϼ��� > ");
				int userNum = scanner.nextInt();
				arr[i] = userNum;
			}
			
			//�հ� ����
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			
			//��� ����
			avg = sum/arrNum;
			
			//����ϱ�
			System.out.println("�հ� = " + sum);
			System.out.println("��� = " + avg);
			
			//�ٽ��Ұ��� ����� 
			System.out.println("�ٽ��غ��ðھ��? (Y/N)");
			String again = scanner.next();
			String againUpper = again.toUpperCase();
			
			while(!(againUpper.equals("Y")||againUpper.equals("N"))) {
				System.out.println("�߸��Է��߽��ϴ�.");
				System.out.println("�ٽ��غ��ðھ��? (Y/N)");
				again = scanner.next();
				againUpper = again.toUpperCase();
			}
			
			if(againUpper.equals("N")) {
				break;
			}
		}

	}
}
