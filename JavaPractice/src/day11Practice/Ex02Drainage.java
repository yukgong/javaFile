package day11Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02Drainage {
	/*
	 * N(1000������ �ڿ���)�� �Է��ϰ� N ������ �ڿ����� 3�� ���, 5�� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻʽÿ�.
	 * 
	 * 1000������ �ڿ��� �Է��ϱ�
	 * 
	 * N������ �ڿ����� ��� 3�� ��� �׸��� 5�� ����� ��
	 */

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		int x = Integer.parseInt(input);
		int sum3x, sum5x;
		sum3x = sum5x = 0;

		// 3�� ����� ���� ���ϱ�
		for (int i = 0; i <= x; i++) {
			if(i%3 == 0) {
				sum3x += i;
			} else if(i%5 == 0) {
				sum5x += i;
			}
		}

		int result = sum3x + sum5x;
		System.out.println(result);
	}
}
