package day07Practice;

import java.util.Scanner;

public class Ex01Upper {
	public static void main(String[] args) {
		// ���ڿ��� �Ѱ��ָ� �빮�ڷ� �����ؼ� �����ϱ�
		
		// �ʱ�ȭ
		String str, result;
		
		// ���ڿ� �Է��ϱ�
		str = inputNum();
		
		// �Է��� ���ڸ� �빮�ڷ� �ٲ��ֱ�
		result = upper(str);
		
		// ��� ����ϱ�
		System.out.println(result);
		
	}
	//--------------function----------------
	
	// ���� �Է� �޴� �Լ�
	static String inputNum() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ĺ� �ҹ��ڸ� �Է��ϼ��� :");
		String str = sc.next();
		
		return str;
	}
	
	// �ҹ��ڸ� �빮�ڷ� �ٲ��ֱ�
	static String upper(String str) {
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if('a' <= c && c <= 'z') {
				int stringToUpper = (int) c -32;
				result += (char)stringToUpper; 
			} else {
				result = result + c;
			}
		}
		return result;
	}
}
