package day10;

import java.util.Scanner;

public class Sorting {
	// 클래스 멤버 변수 (내부에서 필요한 처리를 하는 변수) -> 두가지 이상 메소드에서 접근해야할 경우 사용한다.
	int number[];
	boolean updown;

	// 클래스 멤버 메소드

	// 입력
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정렬할 갯수 : ");
		int count = scanner.nextInt();
		
		number = new int[count];
		
		for (int i = 0; i < number.length; i++) {
			System.out.print((i+1) + "번째 수 : ");
			number[i] = scanner.nextInt();
		}
		
		System.out.print("오름(1)/내림(2) : ");
		int ud = scanner.nextInt();
		if(ud == 1) updown = true;
		else		updown = false;
	}

	// 정렬
	public void sorting() {
		for (int i = 0; i < number.length -1 ; i++) {
			for (int j = i+1; j < number.length; j++) {
				if(updown == true) {
					if(number[i] > number[j]) {
						swap(i,j);
					}
				} else {
					swap(i,j);
				}
			}
		}
	}

	// 교환
	public void swap(int i, int j) {
		int temp = number[i];
		number[i] = number[j];
		number[j] = temp;
	}

	// 결과 출력
	public void result() {
		for (int i = 0; i < number.length; i++) {
			System.out.println(i + ":" + number[i]);
			
		}
	}
}
