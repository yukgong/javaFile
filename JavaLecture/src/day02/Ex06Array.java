package day02;
/*
 * Array : �迭
 * ������ Ȯ���̴�. 
 */

public class Ex06Array {
	public static void main(String[] args) {
		int array[] = new int[3]; 
		int num1, num2, num3;
		
		array[0] = 11;
		array[1] = 22;
		array[2] = 33;
		
		//�迭 �ʱ�ȭ ���
		int tag = 1; // �Ϲ� ���� �ʱ�ȭ ���
		int arr[] = {1,2,3}; // �迭�� �ʱ�ȭ
		
		System.out.println("arr["+ arr[0] + "]");
		System.out.println("arr["+ arr[1] + "]");
		System.out.println("arr["+ arr[2] + "]");
		
		//1�� ��� -> ó������ �ʱ�ȭ
		char charArr[] = {'H','e','l','l','o'};
		System.out.println(charArr);
		
		System.out.println(charArr[0]);
		System.out.println((int)charArr[0]); //ASCII code
		
		//2�� ��� -> �ʱ�ȭ �� �Ҵ�
		char charArr2[] = new char[5];
		charArr2[0] = 'H';
		charArr2[1] = 'e';
		charArr2[2] = 'l';
		charArr2[3] = 'l';
		charArr2[4] = 'o';
		System.out.println(charArr2);
		
	
		
	}
}
