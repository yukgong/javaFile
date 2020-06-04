package day06;

public class Ex01Array {
	public static void main(String[] args) {
		int arrayTag[] = { 11, 22, 33, 44, 55 };
		System.out.println(arrayTag);

		// 인덱스 값의 참조
		arrayTag[1] = 222;
		System.out.println(arrayTag[1]);

		// 배열끼리의 참조
		int array1[] = arrayTag;

		// 배열 내용 확인하기
		int array2[][] = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8, 45 }, // 가능하면 배열의 작은 묶음의 갯수를 맞춘다.
				{ 9, 10, 11, 12 } 
		};

		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.println("array2[" + i + "][" + j + "] = " + array2[i][j]);
			}
			System.out.println();
		}

	}
}
