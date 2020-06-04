package day09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex05FileReadClass {
	public static void main(String[] args)throws Exception { // 메인에도 Exception을 추가할 수 있다.
		// file read 파일 읽어오기

		File file = new File("d:/tmp/test.txt");

			// 인스턴스 객체 생성
			FileReader fr = new FileReader(file);
			
			// 한 문자씩 읽어 들이기
			int c = fr.read();
			String str = "";
			while(c != -1) { // -1은 파일의 끝을 뜻한다. 파일을 모두 읽어오면 반복문이 종료된다.
				System.out.println((char) c);
				str += (char)c;
				c = fr.read();
			}
			
			System.out.println(str);
			//------------------------------
			
			//문장으로 읽어 들이기 buttfer == 저장공간을 뜻한다.
			String str2 = "";
			BufferedReader br = new BufferedReader(fr); // 한 문장씩 일어들이는 함수
			while((str2 = br.readLine()) != null) {
				System.out.println(str2);
//				str2 = br.readLine();
			}
			br.close();
	}
}
