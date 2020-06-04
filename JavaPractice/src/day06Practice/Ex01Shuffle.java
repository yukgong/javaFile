package day06Practice;

public class Ex01Shuffle {
	public static void main(String[] args) {
		// 랜덤 로또 번호 생성하기 1~46번

		// 선언문
		int arr[] = new int[6];
		boolean randomSwitch[] = new boolean[46];

		// randomSwitch init
		for (int i = 0; i < randomSwitch.length; i++) {
			randomSwitch[i] = false;
		}

		// arr 배열에 중복없이 숫자 넣기
		int w, r;
		w = r = 0;

		while (w < 6) {
			// create random number
			r = (int) (Math.random() * 46);

			if (randomSwitch[r] == false) {
				randomSwitch[r] = true;
				arr[w] = r + 1;
				w++;
			}
		}
		// test 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		System.out.println();

		// 정렬하기
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// test 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
}
