package day06Quiz;

/*
 * 1. 이차원 배열을 일차원 배열로 대입하기
 * 
 * int arr2[][] = {
 * 	{1, 2, 3},
 *  {4, 5, 6}
 * }
 * 
 * int array[] = new int[?];
 * 
 * --------------------------
 * 
 * 2. 피보나치 수열 구현하기
 * 
 * 0 1 1 2 3 5 6 13 21 34
 * 앞에 두개의 숫자를 합한 값이 그 다음 값이 된다.
 * 
 */
public class Quiz01Sorting {
	public static void main(String[] args) {
		// 1. 이차원 배열을 일차원 배열로 대입하기

		// 이차원 배열과 일차원 배열 선언하기
		int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

		// 이차원 배열의 길이 만큼 일차원 배열 공간 할당
		int arr2Langth = arr2.length * arr2[0].length;
		int arr1[] = new int[arr2.length * arr2[0].length];

		// 이차원 배열
		int k = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {

				// 아래 방식은 배열이 일률적이지 않을 때 문제가 발생할 확률이 높다.
				arr1[k] = arr2[i][j];
				k++;
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}

		// --------------------------------------------

		// 2. 피보나치 수열 구현하기

		// 배열 생성하기
		int arr[] = new int[10];

		// 초기화
		int a = 0;
		int b = 1;
		int c;
		
		arr[0] = a;
		arr[1] = b;


		// a+b = c;
		for (int i = 2; i < arr.length; i++) {
			c = a + b;
			arr[i] = c;
			
			//값 갱신
			a = b;
			b = c;
			
		}

		// 출력하기
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}

		// -----------------------------------------------

		// 1. 이차원 배열을 일차원 배열로 대입하기

		char array2[][] = { { 'A', 'B', 'C' }, // [0][0] [0][1] [0][2]
				{ 'D', 'E', 'F' }, // [1][0]
				{ 'G', 'H', 'I' }, { 'J', 'K', 'L' } };

		char array1[] = new char[array2.length * array2[0].length];
		/*
		 * array2[0][0] 3 * 0 + 0 -> array1[0] array2[0][1] 3 * 0 + 1 -> array1[1]
		 * array2[0][2] 3 * 0 + 2 -> array1[2]
		 * 
		 * array2[1][0] 3 * 1 + 0 -> array1[3] array2[1][1] 3 * 1 + 1 -> array1[4]
		 * array2[1][1] 3 * 1 + 2 -> array1[5]
		 */

		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[0].length; j++) {
				array1[array2[0].length * i + j] = array2[i][j];
			}
		}

		for (int i = 0; i < array1.length; i++) {
			System.out.println(i + ":" + array1[i]);
		}

		// -----------------------------------------------

		// 2. 피보나치 수열 구현하기

		// 초기화
		long a1, b1, c1;

		long arrNum[] = new long[30];

		int w = 2;
		// 초기값
		a = 0;
		b = 1;
		
		arrNum[0] = a;
		arrNum[1] = b;
		
		while (w < 30) {

			c = a + b;
			arrNum[w] = c;

			// 값을 갱신
			a = b;
			b = c;

			w++;
		}
		
		for (int i = 0; i < arrNum.length; i++) {
			System.out.println(arrNum[i] + " ");
		}

	}
}
