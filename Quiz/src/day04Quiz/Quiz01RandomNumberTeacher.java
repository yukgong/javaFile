package day04Quiz;

import java.util.Scanner;

public class Quiz01RandomNumberTeacher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�ʱ�ȭ
		int rNum, uNum;
		boolean clear = false;
		
		while(true) {
		
			//���� ���� �߻� 
			// 1~100���� ������ ���� �߻��ϱ�
			rNum = (int) ((Math.random() * 100)+1);
			
			
			/////////////////// loop = 10
			
			// ���� ���߶���ϱ�, ���� �Է¹ޱ�
			System.out.println("���� �����ϰ� �ִ� ���� �ϳ��� ���纼����?");
			System.out.println("���� �Է� (1~100���� ����) >");
			uNum = sc.nextInt();
			
			
			int w = 0;
			
			while (w > 10) {
				
			}
			
			
			//��(����)
			int find = 0; 
			if(uNum > rNum) {
				find = 0;
				
			} else if(uNum < rNum) {
				find = 1;
			}
			else { // Bingo!
				clear = true;
				break;
			}
			
			//�޽����� ���
			if(find == 0) {
				
			}
			
			/////////////////////////
			
			if(clear) {
				System.out.println("�����մϴ�. �����Դϴ�.");
			} else {
				System.out.println("�ƽ����ϴ�. �ٽ� �ѹ� �����Ͻñ� �ٶ��ϴ�.");
			}
			
			//play again?
			String msg;
			System.out.println("�ٽ� �����Ͻðڽ��ϱ�?");
			msg = sc.next();
			
			if(msg.equals("n")||msg.equals("N")) {
				System.out.println("�ȳ��� ���ʽÿ�.");
				break;
			}
			////////////////
		}
			
	}
}
