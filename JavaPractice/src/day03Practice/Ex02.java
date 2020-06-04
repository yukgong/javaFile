package day03Practice;

public class Ex02 {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;
		int temp = 0;
		
		temp = z; //3
		z = x;  // 1
		x = y;  // 3
		y = temp; //3
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);

		
		
	}

}
