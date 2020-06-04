package day05;

public class Ex01Card {
	public static void main(String[] args) {
		// Ʈ����ī��� 52��
		// A(1) 2 3 4 5 ~ 10 J(11) Q(12) k(13) * 4
		// 0 ~ 12 -> (0~)�����̵�, (13~)���̾�, (26~)��Ʈ, (39~)Ŭ�ι�
		// 0 ~ 51 ����

		/*
		 * ���� ���� ���� ��ȣ (0~51) (1~13) ���� : 13 ���̾� 1 ���� : 3 �����̵� 4 . .
		 */

		// ����
		int rNum[] = new int[52]; // random ��ȣ
		boolean randomSwitch[] = new boolean[52]; // �ߺ��� üũ
		int r, w;

		// init
		for (int j = 0; j < randomSwitch.length; j++) {
			randomSwitch[j] = false;
		}
		w = 0;

		// 1~52������ ���� �迭�� ī�� ����
		// ����(shuffle), ����(ȿ��), Ʈ��, Ž��(�ӵ�)
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
		int cardPic; // 0 ~ 3 0:�����̵� 1:���̾� 2:��Ʈ 3:Ŭ�ι�

		// ����
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
			} else { // �� ���� ��
				System.out.print("card number : " + (rNum[i]+1) + ", " + cardNum);
			}
//			System.out.println();
			
			// �׸�
			cardPic = rNum[i] / 13; // 0~3
			switch (cardPic) {
			case 0:
				System.out.println(", �����̵�");
				break;
			case 1:
				System.out.println(", ���̾�");
				break;
			case 2:
				System.out.println(", ��Ʈ");
				break;
			case 3:
				System.out.println(", Ŭ�ι�");
				break;

			}
		}
	}
}
