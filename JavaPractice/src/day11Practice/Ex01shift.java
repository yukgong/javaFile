package day11Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex01shift {
	public static void main(String[] args) throws Exception {
		int result;

		// a�� b�� �ޱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		//�Է� ���� ���ڸ� ������ �������� �߶� splitNum�迭�� �־��ֱ�
		String splitNum[] = input.split(" ");
		
		//splitNum�迭�� ������ a�� b�� �����ϱ�
		String a = splitNum[0];
		String b = splitNum[1];
		
		//���ڿ��� �Ǿ��ִ� a�� b�� ���ڷ� �ٲٱ�
		int aNum = Integer.parseInt(a);
		int bNum = Integer.parseInt(b);

		// a >> b =?
		result = aNum >> bNum;
		System.out.println(result);

		// a << b =?
		result = aNum << bNum;
		System.out.println(result);

		// ------------------------------

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String input = br.readLine();
//
//		// �Է°��� ���ڷ� �ٲٱ�
//		int x = Integer.parseInt(input);
//
//		// �Է� ���� ������ ��� ���ϱ�
//		for (int i = 1; i <= x; i++) {
//			int result = x % i;
//			if (result == 0) {// �Է� ���� ���ڸ� ���� �� �ִ� ���� ��� ��� -> ������ �� 0�� �Ǵ� ���ڸ� ���Ѵ�.
//				System.out.print(i+" ");
//			}
//		}
//	}
	}
}