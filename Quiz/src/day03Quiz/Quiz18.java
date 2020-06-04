package day03Quiz;

public class Quiz18 {
	public static void main(String[] args) {
		/*
			*****
			*****
			*****
			*****
			*****
			*****
			*****
			*****
			*****
		 
		 */
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("¡Ù");
			}
			System.out.println();
		}

		/*
			 *
			 **
			 ***
			 ****
			 *****
			 ****
			 ***
			 **
			 *
		 */

		System.out.println();
		for (int i = 1; i <= 9; i++) { //1~9

			if (i <= 5) {
				for (int j = 1; j <= i; j++) {
					System.out.print("¡Ù");
				}
			} else {
				for (int j = i; j <= 9; j++) {
					System.out.print("¡Ù");
				}
			}

			System.out.println();
		}

//		-----
		
		//°­»ç´Ô ¹æ½Ä
		int n = 0;
		for (int j = 0; j < 9; j++) { // 0 ~ 8

			if (j < 5)
				n = n + 1;
			else
				n = n - 1;
			for (int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

//		-----

		// **·£´ý ¹è¿­·Î º°Âï±â ÇØº¸±â

		System.out.println();
		int stars[] = { 2, 1, 3, 5, 1, 4 };

		for (int i = 0; i < stars.length; i++) {
			for (int j = 0; j < stars[i]; j++) {
				System.out.print("¡Ù");
			}
			System.out.println();
		}

	}
}
