package day01Quiz;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//�̸� �Է¹ޱ�
		System.out.println("name\t >");
		String name = scanner.next();
		
		//���� �Է� �ޱ�
		System.out.println("age\t >");
		int age = scanner.nextInt();
		
		//���� �Է� �ޱ�
		System.out.println("gender\t >");
		String gender = scanner.next();
		
		//��ȣ �Է� �ޱ�
		System.out.println("phone \t>");
		String phone = scanner.next();
		
		//Ű �Է� �ޱ�
		System.out.println("height\t >");
		double height = scanner.nextDouble();
		
		//�ּ� �Է� �ޱ�
		System.out.println("address\t >");
		String address = scanner.next();
		
		
		//���
		
		System.out.println("========================================================");
		System.out.println("|name\tage\tgender\tphone\t\theight\taddress|");
		System.out.println("========================================================");
		System.out.println("|" + name + "\t" + age + "\t" + gender  + "\t" + phone + "\t" + height + "\t" + address + "\t" + "|");
		System.out.println("========================================================");
		
		
		
		scanner.close();
	}
	

}
