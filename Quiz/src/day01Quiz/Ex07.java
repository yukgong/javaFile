package day01Quiz;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//이름 입력받기
		System.out.println("name\t >");
		String name = scanner.next();
		
		//나이 입력 받기
		System.out.println("age\t >");
		int age = scanner.nextInt();
		
		//성별 입력 받기
		System.out.println("gender\t >");
		String gender = scanner.next();
		
		//번호 입력 받기
		System.out.println("phone \t>");
		String phone = scanner.next();
		
		//키 입력 받기
		System.out.println("height\t >");
		double height = scanner.nextDouble();
		
		//주소 입력 받기
		System.out.println("address\t >");
		String address = scanner.next();
		
		
		//결과
		
		System.out.println("========================================================");
		System.out.println("|name\tage\tgender\tphone\t\theight\taddress|");
		System.out.println("========================================================");
		System.out.println("|" + name + "\t" + age + "\t" + gender  + "\t" + phone + "\t" + height + "\t" + address + "\t" + "|");
		System.out.println("========================================================");
		
		
		
		scanner.close();
	}
	

}
