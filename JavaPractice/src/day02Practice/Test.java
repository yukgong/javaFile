package day02Practice;

import java.util.Scanner;

import java.util.Random;



public class Test

{

	public static void main(String[] args)

	{

		// Scanner Ŭ���� ��� �ν��Ͻ� ����

		Scanner sc = new Scanner(System.in);



		// �ȳ��޼��� ���

		System.out.print("�߻���ų ������ ���� �Է� : ");

		int size = sc.nextInt();



		// size ������ ��Ƴ� �� ��ŭ�� �迭�� �����

		// (�迭 ���� �� �޸� �Ҵ�)

		int[] arr = new int[size];



		// ������ ����(����)�� �߻���Ű�� ���ؼ���

		// ���� �߻� ���� ��ü�� �ʿ��ϴ�.

		// �� ��java.util.Random��

		Random rd = new Random();



		// �׽�Ʈ

		//System.out.println("�߻��� ���� : " + rd.nextInt(100)); // 0~99

		// ��Random Ŭ������ nextInt()�� �޼ҵ�

		// 0 ~ �Ű������� �Ѱܹ��� ���� - 1 ������ �� �߿��� ������ ����(����) 1���� �߻���Ų��.



		for (int i=0; i<size; i++)

		{

			arr[i] = rd.nextInt(100)+1; // 1~100 ������ ���� �� 1�� �߻�~!!!

			System.out.printf("%3d", arr[i]);

		}

		System.out.println();

		System.out.println();

		

		//���� ū ��, ���� ���� �� Ȯ��

		int max, min;		//-- �ִ밪, �ּҰ�

		max=min=arr[0];		//max=min=72 �ʱ�ȭ�� �迭 �� �ϳ��� �����ϴµ� ���ǻ� ù��°��!

		for (int i=1; i<arr.length; i++)

		{

			if (max<arr[i])

				max=arr[i];

			if (min>arr[i])

				min=arr[i];

		}



		System.out.printf("���� ū �� : %d, ���� ���� �� : %d\n", max, min);

	}

}