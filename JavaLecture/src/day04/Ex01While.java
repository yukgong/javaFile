package day04;

public class Ex01While {
	public static void main(String[] args) {
		int w;

		w = 0;
		while(w < 10) {
			System.out.println("w = " + w );
			w++;
		}
		System.out.println();
		
		int dw;
		dw = 0;
		do {
			System.out.println("dw = " + dw);
			dw++;
		} while(dw < 10);
		
//		--------
		
		//���� ���ǹ� �����
		
		//for���� �̷��� ���� ���ǹ��� �����.
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			for (int j = 0; j < 5; j++) {
				System.out.println("\tj = " + j);
			}
		}
		
		//while���� �̷��� ���� ���ǹ��� �����.
		int w1, w2;
		w1 = w2 = 0;
		
		while(w1 < 10) {
			System.out.println("w1 = " + w1);
			
			w2 = 0; // w2 �ʱ�ȭ�� while�� �ȿ��� ����� ����� �����Ѵ�. ��ġ ����صѰ�.
			while(w2 < 5) {
				System.out.println("\tw2 = " + w2);
				w2++;
			}
			w1++;
		}
		
//		-----
		
		//���� ���� �����
		w1 = 0;
		while(true) {
			System.out.println("w1 = " + w1);
			w1++;
		}
		
		
		
		
		
	}
}
