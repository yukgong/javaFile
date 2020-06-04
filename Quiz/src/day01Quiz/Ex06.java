package day01Quiz;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println("=================================================================");
		System.out.println("\\\tname\tage\tman\tphone\t\theight\taddress\t\\");
		System.out.println("=================================================================");
		
		//변수 01
		String name = "\"홍길동\"";
		int age = 20;
		boolean man = true;
		String phone = "010-111-2222";
		double height = 175.2;
		String address = "\"경기도\"";
		
		System.out.println("\\\t" + name + "\t" + age + "\t" + man  + "\t" + phone + "\t" + height + "\t" + address + "\t" + "\\");
		
		//변수 02
		name = "\"일지매\"";
		age = 18;
		man = true;
		phone = "02-123- 4567";
		height = 180.01;
		address = "\"서울\"";
		
		System.out.println("\\\t" + name + "\t" + age + "\t" + man  + "\t" + phone + "\t" + height + "\t" + address + "\t" + "\\" );
		
		//변수 03
		name = "\"장옥정\"";
		age = 14;
		man = false;
		phone = "02-345- 7890";
		height = 155.78;
		address = "\"부산\"";
		
		System.out.println("\\\t" + name + "\t" + age + "\t" + man  + "\t" + phone + "\t" + height + "\t" + address + "\t" + "\\" );
		System.out.println("=================================================================");
	}
}
