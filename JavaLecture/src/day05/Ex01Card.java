package day05;

public class Ex01Card {
	public static void main(String[] args) {
		// 트럼프카드는 52장
		// A(1) 2 3 4 5 ~ 10 J(11) Q(12) k(13) * 4
		// 0 ~ 12 -> (0~)스페이드, (13~)다이아, (26~)하트, (39~)클로버
		// 0 ~ 51 섞기

		/*
		 * 실제 랜덤 실제 번호 (0~51) (1~13) 숫자 : 13 다이아 1 숫자 : 3 스페이드 4 . .
		 */

		// 선언
		int rNum[] = new int[52]; // random 번호
		boolean randomSwitch[] = new boolean[52]; // 중복을 체크
		int r, w;

		// init
		for (int j = 0; j < randomSwitch.length; j++) {
			randomSwitch[j] = false;
		}
		w = 0;

		// 1~52까지의 랜덤 배열에 카드 섞기
		// 셔플(shuffle), 정렬(효율), 트리, 탐색(속도)
		while (w < 52) {
			r = (int) (Math.random() * 52);
			if (randomSwitch[r] == false) {
				randomSwitch[r] = true;
				rNum[w] = r;
				w++;
			}
		}

		// -----------------------------------------

		int cardNum; // 1 ~ 13
		int cardPic; // 0 ~ 3 0:스페이드 1:다이아 2:하트 3:클로버

		// 숫자
		for (int i = 0; i < rNum.length; i++) {
			cardNum = rNum[i] % 13+1; // 1~13

			if (cardNum == 1) { // A
				System.out.print("card number: " + (rNum[i]+1) + ", " + "A");
			} else if (cardNum == 11) { // J
				System.out.print("card number : " + (rNum[i]+1) + ", " + "J");
			} else if (cardNum == 12) { // Q
				System.out.print("card number : " + (rNum[i]+1) + ", " + "Q");
			} else if (cardNum == 13) { // K
				System.out.print("card number : " + (rNum[i]+1) + ", " + "K");
			} else { // 그 외의 수
				System.out.print("card number : " + (rNum[i]+1) + ", " + cardNum);
			}
//			System.out.println();
			
			// 그림
			cardPic = rNum[i] / 13; // 0~3
			switch (cardPic) {
			case 0:
				System.out.println(", 스페이드");
				break;
			case 1:
				System.out.println(", 다이아");
				break;
			case 2:
				System.out.println(", 하트");
				break;
			case 3:
				System.out.println(", 클로버");
				break;

			}
		}
	}
}
