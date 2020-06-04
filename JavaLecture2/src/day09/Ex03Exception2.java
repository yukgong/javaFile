package day09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex03Exception2 {
	public static void main(String[] args) {
		// 자주 쓰이는 예외 처리

		// NullPointException
		String str = null;

		try {
			// 문자열이 비어있는데 접근할 때
			System.out.println(str.length());

		} catch (NullPointerException e) {
			System.out.println("str이 할당되지 않았습니다.");
		}
		
		//------------------------------------------------
		
		// ArrayIndexOutOfBoundsException
		int arr[] = { 2, 4, 6 };

		try {
			// 할당이 되지 않았는데도 접근할 때
			System.out.println(arr[3]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index 범위 초과");
		}
		
		//------------------------------------------------
		
		// FileNotFoundException
		File file = new File("c:\\xxxx.txt");
		FileInputStream is;

		try {
			// 해당 경로에 파일이 없는데도 파일에 접근하려할 때
			is = new FileInputStream(file);

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
		
		//------------------------------------------------

		// NumberFormatException
		int num;

		try {
			// 해당 경로에 파일이 없는데도 파일에 접근하려할 때
			num = Integer.parseInt("123.456");

		} catch (NumberFormatException e) {
			System.out.println("형식이 다릅니다.");
		}
		
		//------------------------------------------------

		// StringIndexOutOfBoundsExeption
		String str1 = "abc";

		try {
			str1.charAt(3);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("문자열의 범위 초과");
		}
		
		//------------------------------------------------
		
		// 예외가 나왔는데, 왜 예외가 발생하는지 모를 때.
		String str2 = "abc";

		try {
			str1.charAt(3);
		} catch (Exception e) { // 모든 예외상황에서 Exception 처리를 해줄 수 있다. 
			System.out.println("문자열의 범위 초과");
		}
		
	}
}
