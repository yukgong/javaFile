package day07Quiz;

import java.util.Scanner;

public class Quiz07Encryption {
	public static void main(String[] args) {
		// ���ĺ��� ���ڸ� �Ʒ��� �־��� ��ȣǥ�� ��ȣȭ�ϴ� ���α׷�

		// a b c d e f g h i j k l m n o p q r s t u v w x y z
		// ` ~ ! @ # $ % ^ & * ( ) - _ + = | [ ] { } ; : , . /

		// 0 1 2 3 4 5 6 7 8 9
		// q w e r t y u i o p

		//-----------------------------------------------------
		
		// abcdefghijklmnopqrstuvwxyz
		char[] abcCode =
				{ 	'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', 
					'(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
					'}', ';', ':', ',', '.', '/' };
		
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		//�ʱ�ȭ
		String str;
		String encryption, decryption;
		
		
		//1. ����ڿ��� ���ڿ� �Է� �ޱ�
		str = input();
		
		//2. �Է� ���� ���ڿ��� ��ȣȭ �ϱ�
		encryption = encryption(str);
		
		//3. ��ȣȭ�� ���ڿ� ����ϱ�
		System.out.println("��ȣȭ:\t" + encryption);
		System.out.println("���� :\t" + str);
		
		//4. ��ȣȭ�� ���ڿ� ��ȣȭ�ϱ�
		decryption = decryption(encryption);
		
		//5. ��ȣȭ�� ���ڿ� ����ϱ�
		System.out.println("��ȣȭ:\t" + decryption);
		System.out.println("���� :\t" + str);
		
		
	}
	
	static String input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȣȭ�� ���ڸ� �Է��ϼ��� :");
		String input = sc.next();
		
		return input;
	}
	
	//�Է� ���� ���ڿ��� ��ȣȭ �ϴ� �Լ�
	static String encryption(String str) {
		String arrStr[] = new String[str.length()];
		String strToLock = "";
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		char[] abcCode =
			{ 	'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', 
				'(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
				'}', ';', ':', ',', '.', '/' };
		
		String num = "0123456789";
		String abc = "abcdefghijklmnopqrstuvwxyz";
		
		for (int i = 0; i < str.length(); i++) {
			//���ڿ����� i��° ������ �ִ� ���ڸ� c�� �������ش�.
			char c = str.charAt(i);
			
			//c�� ���ڸ�
			if('0' <= c && c <= '9') {
				//num ���ڿ����� c�� �ش��ϴ� ���ڰ� ���° ��ġ���� n�� �������ش�.
				int n = num.indexOf(c);
				//stringToLock�� ���ڿ����� 
				//c���� �ش��ϴ� ���ڿ� numCode�迭��[n]������ �ش��ϴ� ���ڿ� �ٲ��ش�.
				arrStr[i] = String.valueOf(numCode[n]);
			}
			
			//c�� ���ڸ�
			if('a'<= c && c <= 'z') {
				//abc ���ڿ����� c�� �ش��ϴ� ���ڰ� ���° ��ġ���� n�� �������ش�.
				int n = abc.indexOf(c);
				//stringToLock�� ���ڿ����� 
				//c���� �ش��ϴ� ���ڿ� abcCode�迭��[n]������ �ش��ϴ� ���ڿ� �ٲ��ش�.
				arrStr[i] = String.valueOf(abcCode[n]);
			}
		}
		//�迭�� ��Ҹ� ���ڿ��� �־��ֱ�
		for (int i = 0; i < arrStr.length; i++) {
			strToLock += arrStr[i];
		}
		
		return strToLock;
	}
	
	//��ȣȭ�� ���ڿ� ��ȣȭ �ϱ�
	static String decryption(String str) {
		String arrStr[] = new String[str.length()];
		String unlock = "";
		char[] numCode = {'0','1','2','3','4','5','6','7','8','9'};
		char[] abcCode =
			{ 	'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
				'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
				'v', 'w', 'x', 'y', 'z' };
		
		String num = "qwertyuiop";
		String abc = "`~!@#$%^&*()-_+=|[]{};:./";
		
		//���ڿ��� Ȯ���ؼ� ���ڸ� numCode �迭�� ������ �°� �������ֱ�
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if('a' <= c && c <= 'z') {
				int n = num.indexOf(c);
				arrStr[i] = String.valueOf(numCode[n]);
			}
			
			if(!('a'<= c && c <= 'z' || '0' <= c && c <= '9')) {
				int n = abc.indexOf(c);
				arrStr[i] = String.valueOf(abcCode[n]);
			}
		}
		
		for (int i = 0; i < arrStr.length; i++) {
			unlock += arrStr[i];
		}

		return unlock;
	}
}
