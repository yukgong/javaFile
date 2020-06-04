package day11Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02Drainage {
	/*
	 * N(1000이하의 자연수)을 입력하고 N 이하의 자연수중 3의 배수, 5의 배수의 합을 구하는 프로그램을 작성하십시오.
	 * 
	 * 1000이하의 자연수 입력하기
	 * 
	 * N이하의 자연수중 모든 3의 배수 그리고 5의 배수의 합
	 */

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		int x = Integer.parseInt(input);
		int sum3x, sum5x;
		sum3x = sum5x = 0;

		// 3의 배수인 숫자 구하기
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
