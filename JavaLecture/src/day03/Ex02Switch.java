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
		
//		// ����ġ����  > < >= <= !�� ����� �� ����.
//		switch (num) {
//		case num > 2 :
//			System.out.println("num = 1");
//			break;
//		}
		
		
		char c = '��';
		switch (c) {
		case '��':
			System.out.println("c = ��");
			break;
		}
		
//		//if�������� �Ǽ��� ����� �� ������, ����ġ�������� ����� �� ����.
//		double d = 123.1;
//		switch (d) {
//		case 123.1 :
//			System.out.println("d = 123.1");
//			break;
//		}
		
		
		//String ���ڿ� �񱳰� �ȴ�.
		String str = "ABC";
		switch (str) {
		case "ABC" :
			System.out.println("str = " + str);
			break;
		} 
		
		
//		-------
		
//		switch���� �ǹ����� ���Ǵ� ���
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
