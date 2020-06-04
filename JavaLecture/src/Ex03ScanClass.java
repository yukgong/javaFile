import java.util.Scanner;

public class Ex03ScanClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		// 논리형
		boolean b;
		System.out.println("true/false를 입력하세요 : ");
		b = scan.nextBoolean(); // true/false
		
		System.out.println(b+"를 입력했습니다.");
		
		
		
		//정수형
		int number;
		System.out.println("정수를 입력하세요 :");
		number = scan.nextInt();
		System.out.println(number+"를 입력했습니다.");
		
		//실수형
		double d;
		System.out.println("실수를 입력하세요 :");
		d = scan.nextDouble();
		System.out.println(d+"를 입력했습니다.");
		
		
		//문자열
		String str;
		System.out.println("문자열을 입력하세요 :");
		str= scan.next();
		System.out.println(str+"를 입력했습니다.");
		
		scan.close();
	}
}
