package day02Quiz;

import java.util.Random;

public class Quiz13 {
	static final int SIZE = 6;
	public static void main(String[] args) {
		//���� ���� ����϶�. 
		
		//���� 0 ~ 99�� ������ 1��
		int random;
		random = (int) (Math.random() * 100);
		System.out.println(random);
		
		//���� 11, 12, 13, 14, 15�� ������ 1��
		random = ((int) (Math.random() * 5))+11;
		System.out.println(random);
		
		//���� 1~45�� ������ 6��
		for (int i = 0; i < SIZE; i++) {
			random = ((int) (Math.random() * 45))+1;
			System.out.print(random+" ");
		}
		
		
	}

}
