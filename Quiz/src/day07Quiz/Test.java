package day07Quiz;

public class Test {
	public static void main(String[] args) {
		String n = "'`', '~', '!', '@', '#', '$', '%', '^', '&', '*','(', ')', '-', '_', '+', '=', '|', '[', ']', '{','}', ';', ':', ',', '.', '/'";
		String num = "'q','w','e','r','t','y','u','i','o','p'";
		
		filtering(n);
		filtering(num);
	}
	
	static String filtering(String str) {
		String replace = str.replace(" ", "");
		String replace1 = replace.replace("'", "");
		String replace2 = replace1.replace(",", "");

		System.out.println(replace2);
		
		return str;
	}
}
