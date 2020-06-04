package day09;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex06fileWriteClass {
	public static void main(String[] args) throws Exception {
		//file write
		File file = new File("d:/tmp/test.txt");
		
		//한문자씩 쓰기
		FileWriter fw1 = new FileWriter(file);
		fw1.write("안녕하세요?" + "\n");
		fw1.close();
		
		//기종 문장은 유지하면서 추가 기입하기 append
		//이 기능도 한문자씩 쓰기 방식이라 효율성은 떨어진다.
		FileWriter fw2 = new FileWriter(file, true);
		fw2.write("건강하세요" + "\n");
		fw2.close();
		
		
		FileWriter fw3 = new FileWriter(file); // 파일 인스턴스 설정
		BufferedWriter bw = new BufferedWriter(fw3); //문장으로
		PrintWriter pw = new PrintWriter(bw);
		
		pw.print("안녕" + "\n"); // file에다 출력하기
		pw.println("디지몬");
		pw.close();//파일을 제대로 저장하기 위해서 PrintWriter는 반드시 close를 사용한다.
	}
}
