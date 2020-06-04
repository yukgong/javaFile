package day07Quiz;

import java.util.Scanner;

public class Quiz07Encryption_teacher {
	public static void main(String[] args) {
		// ���ĺ��� ���ڸ� �Ʒ��� �־��� ��ȣǥ�� ��ȣȭ�ϴ� ���α׷�

		// a b c d e f g h i j k l m n o p q r s t u v w x y z
		// ` ~ ! @ # $ % ^ & * ( ) - _ + = | [ ] { } ; : , . /

		// 0 1 2 3 4 5 6 7 8 9
		// q w e r t y u i o p

		// -----------------------------------------------------

		// �ʱ�ȭ
		String str;
		String encryption, decryption;

		// 1. ����ڿ��� ���ڿ� �Է� �ޱ�
		str = input();

		// 2. �Է� ���� ���ڿ��� ��ȣȭ �ϱ�
		encryption = encryption(str);

		// 3. ��ȣȭ�� ���ڿ� ����ϱ�
		System.out.println("��ȣȭ:\t" + encryption);

		// 4. ��ȣȭ�� ���ڿ� ��ȣȭ�ϱ�
		decryption = decryption(encryption);
		// 5. ��ȣȭ�� ���ڿ� ����ϱ�
		System.out.println("��ȣȭ:\t" + decryption);


	}
	
	//----------------------------------------------------

	static String input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȣȭ�� ���ڸ� �Է��ϼ��� :");
		String input = sc.next();

		return input;
	}

	// �Է� ���� ���ڿ��� ��ȣȭ �ϴ� �Լ�
	static String encryption(String str) {
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };
		
		String resultCode = "";


		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			int n = (int) ch;

			// ���ĺ��� ���
			if (n >= 97 && n <= 122) {
				n = n - 97; // 97 == 0;
				resultCode = resultCode + abcCode[n];
			}

			// ������ ���
			if (n >= 48 && n <= 57) {
				n = n - 48; // 48 == 0;
				resultCode = resultCode + numCode[n];
			}
		}
		return resultCode;
	}

	// ��ȣȭ�� ���ڿ� ��ȣȭ �ϱ�
	static String decryption(String str) {
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };
		
		String baseCode = "";
		
		for (int i = 0; i < str.length(); i++) {
			//�Է� ���� ������ i��°�� ���ڰ� ch�� ���� �ȴ�.
			char ch = str.charAt(i);
			
			//ch�� �����ڵ� ���ڰ� n�� ���� �ȴ�.
			int n = (int)ch;
			
			int index = 0;
			
			//���� �Է� ���� ��ȣȭ�� ���ڰ� ���ĺ��̸�
			if(n >= 97 && n <= 122) {
				for (int j = 0; j < numCode.length; j++) { // numCode�迭�� ���̸�ŭ �ݺ����� ����ȴ�.
					if(ch == numCode[j]) { 				   // ch�� ���� ���ڿ� numCode[j]��° ���� ���ڿ� ���ٸ�
						index = j; 						   // index�� j���� �ȴ�.
						break;							   // ã������ �ݺ����� ����ȴ�.
					}
				}
				index = index + 48; 					   // index
				baseCode = baseCode + (char)index;
			} 
		
			else {				  // ��ȭȭ�� ���ĺ�
				for (int j = 0; j < abcCode.length; j++) {
					if(ch == abcCode[j]) {
						index = j;
						break;
					}
				}
				index = index + 97;
				baseCode = baseCode + (char)index;
			}
		}
		
		return baseCode;
	}

}
