package day01Practice;

public class Quiz2_5 {
	public static void main(String[] args) {
		System.out.println("1"+"2");  
		// output -> 12
		
		System.out.println(true + "");
		// output -> true
		
		System.out.println('A'+'B'); 
		// ����(char)�� ������ ���� ������ ����� int�� �������� �ȴ�. 
		// �ֳ��ϸ� int��(4byte)���� ���� Ÿ��(byte, char, short)�� int������ ��ȯ�� �Ŀ� ���� ������ ����ȴ�.
		// 'A'+'B'�� ���, char(65) + char(66) -> int + int -> int(131)�� ������ ���� ���� ����� int�� ���� ���� �ȴ�.
		// output -> 131
		
		System.out.println('1'+2); 
		// '1' + 2 -> char(49) + int(2) -> int(49) + int(2) -> int(51)
		// output -> 51
		
		
		System.out.println('1'+'2');
		// '1' + 2 -> char(49) + char(50) -> int(49) + int(50) -> int(99)
		// output -> 99
		
		System.out.println('J' + "ava"); 
		// ���� ���� ������ ���������� �ڵ������ ���������� int�� �ƴ� ���ڿ��� ���Ƿ� ������ �����ʹ� ���ڿ��� ����ȴ�.
		//output -> Java
		
//		System.out.println(true + null);// error
		
	}

}
