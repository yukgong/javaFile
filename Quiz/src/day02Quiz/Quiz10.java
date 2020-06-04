package day02Quiz;

public class Quiz10 {

	public static void main(String[] args) {
		/*
		 * int number 
		 * number = 5;
		 * -----------
		 * 
		 * 5
		 * 0101
		 * ------------
		 * number = number <<4;
		 * -> 0101 0000 = 5*16 = 80
		 * 
		 * number = number >> 5;
		 * -> 0000 0010 = 2 
		 * 
		 * number = number >> 1;
		 * -> 0000 0001 = 1
		 */
		
		
		int number;
		number = 5;
		number = number << 4;
		System.out.println(number);
		
		number = number >> 5;
		System.out.println(number);
		
		number = number >> 1;
		System.out.println(number);
	}

}
