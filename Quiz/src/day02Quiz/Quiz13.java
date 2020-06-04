package day02Quiz;

import java.util.Random;

public class Quiz13 {
	static final int SIZE = 6;
	public static void main(String[] args) {
		//랜덤 수를 취득하라. 
		
		//범위 0 ~ 99의 숫자중 1개
		int random;
		random = (int) (Math.random() * 100);
		System.out.println(random);
		
		//범위 11, 12, 13, 14, 15의 숫자중 1개
		random = ((int) (Math.random() * 5))+11;
		System.out.println(random);
		
		//범위 1~45의 숫자중 6개
		for (int i = 0; i < SIZE; i++) {
			random = ((int) (Math.random() * 45))+1;
			System.out.print(random+" ");
		}
		
		
	}

}
