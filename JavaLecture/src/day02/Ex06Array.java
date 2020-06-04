package day02;
/*
 * Array : 배열
 * 변수의 확장이다. 
 */

public class Ex06Array {
	public static void main(String[] args) {
		int array[] = new int[3]; 
		int num1, num2, num3;
		
		array[0] = 11;
		array[1] = 22;
		array[2] = 33;
		
		//배열 초기화 방법
		int tag = 1; // 일반 변수 초기화 방법
		int arr[] = {1,2,3}; // 배열의 초기화
		
		System.out.println("arr["+ arr[0] + "]");
		System.out.println("arr["+ arr[1] + "]");
		System.out.println("arr["+ arr[2] + "]");
		
		//1번 방법 -> 처음부터 초기화
		char charArr[] = {'H','e','l','l','o'};
		System.out.println(charArr);
		
		System.out.println(charArr[0]);
		System.out.println((int)charArr[0]); //ASCII code
		
		//2번 방법 -> 초기화 후 할당
		char charArr2[] = new char[5];
		charArr2[0] = 'H';
		charArr2[1] = 'e';
		charArr2[2] = 'l';
		charArr2[3] = 'l';
		charArr2[4] = 'o';
		System.out.println(charArr2);
		
	
		
	}
}
