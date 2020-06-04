package day01Practice;

public class Quiz2_5 {
	public static void main(String[] args) {
		System.out.println("1"+"2");  
		// output -> 12
		
		System.out.println(true + "");
		// output -> true
		
		System.out.println('A'+'B'); 
		// 문자(char)와 문자의 덧셈 연산의 결과는 int형 정수값이 된다. 
		// 왜냐하면 int형(4byte)보다 작은 타입(byte, char, short)은 int형으로 변환된 후에 덧셈 연산이 진행된다.
		// 'A'+'B'의 경우, char(65) + char(66) -> int + int -> int(131)의 과정을 통해 최종 결과는 int형 정수 값이 된다.
		// output -> 131
		
		System.out.println('1'+2); 
		// '1' + 2 -> char(49) + int(2) -> int(49) + int(2) -> int(51)
		// output -> 51
		
		
		System.out.println('1'+'2');
		// '1' + 2 -> char(49) + char(50) -> int(49) + int(50) -> int(99)
		// output -> 99
		
		System.out.println('J' + "ava"); 
		// 위와 같이 문자형 데이터지만 뒤따라오는 데이터형이 int가 아닌 문자열이 오므로 문자형 데이터는 문자열에 흡수된다.
		//output -> Java
		
//		System.out.println(true + null);// error
		
	}

}
