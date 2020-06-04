package day02Practice;

import java.util.Scanner;

import java.util.Random;



public class Test

{

	public static void main(String[] args)

	{

		// Scanner 클래스 기반 인스턴스 생성

		Scanner sc = new Scanner(System.in);



		// 안내메세지 출력

		System.out.print("발생시킬 난수의 갯수 입력 : ");

		int size = sc.nextInt();



		// size 변수에 담아낸 수 만큼의 배열방 만들기

		// (배열 선언 및 메모리 할당)

		int[] arr = new int[size];



		// 무작위 숫자(난수)를 발생시키기 위해서는

		// 난수 발생 전용 객체가 필요하다.

		// → 『java.util.Random』

		Random rd = new Random();



		// 테스트

		//System.out.println("발생한 난수 : " + rd.nextInt(100)); // 0~99

		// 『Random 클래스의 nextInt()』 메소드

		// 0 ~ 매개변수로 넘겨받은 정수 - 1 까지의 수 중에서 무작위 정수(난수) 1개를 발생시킨다.



		for (int i=0; i<size; i++)

		{

			arr[i] = rd.nextInt(100)+1; // 1~100 사이의 난수 중 1개 발생~!!!

			System.out.printf("%3d", arr[i]);

		}

		System.out.println();

		System.out.println();

		

		//가장 큰 값, 가장 작은 값 확인

		int max, min;		//-- 최대값, 최소값

		max=min=arr[0];		//max=min=72 초기화를 배열 중 하나로 선언하는데 편의상 첫번째로!

		for (int i=1; i<arr.length; i++)

		{

			if (max<arr[i])

				max=arr[i];

			if (min>arr[i])

				min=arr[i];

		}



		System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d\n", max, min);

	}

}