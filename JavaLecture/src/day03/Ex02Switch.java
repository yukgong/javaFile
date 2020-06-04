package day03;

public class Ex02Switch {
	public static void main(String[] args) {
		int num = 1;
		
		switch(num) {
			case 0 : 
				System.out.println("num = 0");
				break;
				
			case 1 : 
				System.out.println("num = 1");
				break;
			
			case 2 : 
				System.out.println("num = 2");
				break;
				
			default :
				System.out.println("num != 1 and num != 2");
				break;
		}
		
//		// 스위치에는  > < >= <= !를 사용할 수 없다.
//		switch (num) {
//		case num > 2 :
//			System.out.println("num = 1");
//			break;
//		}
		
		
		char c = '가';
		switch (c) {
		case '가':
			System.out.println("c = 가");
			break;
		}
		
//		//if문에서는 실수를 사용할 수 있지만, 스위치문에서는 사용할 수 없다.
//		double d = 123.1;
//		switch (d) {
//		case 123.1 :
//			System.out.println("d = 123.1");
//			break;
//		}
		
		
		//String 문자열 비교가 된다.
		String str = "ABC";
		switch (str) {
		case "ABC" :
			System.out.println("str = " + str);
			break;
		} 
		
		
//		-------
		
//		switch문이 실무에서 사용되는 경우
//		
//		switch (process) {
//		case CREATE:			
//			break;
//			
//		case PRINT:
//			break;
//			
//		default:
//			break;
//		}
		
		
	}
}
