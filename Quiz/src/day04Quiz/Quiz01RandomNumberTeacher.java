package day04Quiz;

import java.util.Scanner;

public class Quiz01RandomNumberTeacher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//초기화
		int rNum, uNum;
		boolean clear = false;
		
		while(true) {
		
			//랜덤 숫자 발생 
			// 1~100까지 범위의 숫자 발생하기
			rNum = (int) ((Math.random() * 100)+1);
			
			
			/////////////////// loop = 10
			
			// 숫자 맞추라고하기, 숫자 입력받기
			System.out.println("제가 생각하고 있는 숫자 하나를 맞춰볼래요?");
			System.out.println("숫자 입력 (1~100까지 범위) >");
			uNum = sc.nextInt();
			
			
			int w = 0;
			
			while (w > 10) {
				
			}
			
			
			//비교(판정)
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
			
			//메시지를 출력
			if(find == 0) {
				
			}
			
			/////////////////////////
			
			if(clear) {
				System.out.println("축하합니다. 정답입니다.");
			} else {
				System.out.println("아쉽습니다. 다시 한번 도전하시길 바랍니다.");
			}
			
			//play again?
			String msg;
			System.out.println("다시 시작하시겠습니까?");
			msg = sc.next();
			
			if(msg.equals("n")||msg.equals("N")) {
				System.out.println("안녕히 가십시오.");
				break;
			}
			////////////////
		}
			
	}
}
