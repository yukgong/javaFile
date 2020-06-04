package day09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex07fileWork {
	public static void main(String[] args) throws Exception {
		// 파일 만들어서 배열 내용을 파일에 넣어주고 ,읽어온 내용을 배열에 넣기

		// 파일 경로는?
		String link = "d:/tmp/newfile.txt";
		String test = "d:/tmp/newfile.txt";


		// 배열 내용을 파일에 넣어주기
		String arrAtr[] = { "Hello", "안녕하세요", "Hi", "SeeSow" };
		dataSetter(link, arrAtr);
		dataSave(test, arrAtr);

		// 파일을 내용을 불러와서 배열에 넣어주기.
//		readFile(link);

		System.out.println();

		readFile(link);
		
		String arrayStrTest[] = dataLoad(test);
		for (int i = 0; i < arrayStrTest.length; i++) {
			System.out.println(arrayStrTest[i]);
		}
	}

//	// 파일 생성하기
//	static void createFile(String link) throws Exception {
//		String file = link;
//		File newFile = new File(file);
//
//		newFile.createNewFile();
//
//		System.out.println("파일 생성 성공");
//	}
//	
	// ---------------------------

	// 파일 쓰기 - 강사님 코드
	static void dataSave(String link, String arr[]) {
		try {
			FileWriter fw = new FileWriter(link); // 파일 쓰기 인스턴스 설정
			BufferedWriter bw = new BufferedWriter(fw); // 문장으로 쓰기 위해 BufferedWriter를 사용한다.
			PrintWriter pw = new PrintWriter(bw);

			// 배열의 내용을 파일에 넣어주기
			for (int i = 0; i < arr.length; i++) {
				pw.println(arr[i]);
			}
			pw.close();

		} catch (IOException e) {
			System.out.println("파일이 저장 되지 않았습니다.");
		}
		System.out.println("파일이 저장되었습니다.");
	}

	// 파일 쓰기
	static void dataSetter(String link, String arr[]) {
		try {
			FileWriter fw = new FileWriter(link); // 파일 쓰기 인스턴스 설정
			BufferedWriter bw = new BufferedWriter(fw); // 문장으로 쓰기 위해 BufferedWriter를 사용한다.
			PrintWriter pw = new PrintWriter(bw);

			// 배열의 내용을 파일에 넣어주기
			for (int i = 0; i < arr.length; i++) {
				pw.println(arr[i]);
			}
			pw.close();

		} catch (IOException e) {
			System.out.println("파일이 저장 되지 않았습니다.");
		}
		System.out.println("파일이 저장되었습니다.");
	}

	// ---------------------------

	// 파일 읽어오기 - 강사님 코드
	static String[] dataLoad(String link) {
		String str[] = null;
		try {
			FileReader fr = new FileReader(link);
			
			// 데이터를 카운팅(몇개인지?)
			int count = 0;
			String s;
			BufferedReader br = new BufferedReader(fr);
			while ((s = br.readLine()) != null) {
				count++;
			}
			br.close();

			// 배열을 셋팅
			str = new String[count];

			// 읽고 데이터를 저장
			int i = 0;
			fr = new FileReader(link);
			br = new BufferedReader(fr);
			while ((s = br.readLine()) != null) {
				str[i] = s;
				i++;
			}
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}

	// 파일 읽어오기
	static void readFile(String link) throws Exception {
		FileReader fr = new FileReader(link); // 파일을 읽어오는 인스턴트 객체 생성
		BufferedReader br = new BufferedReader(fr); // 특정 파일의 내용을 문장 단위로 읽어오는 객체 생성

		// 동적할당을 위해 문장이 몇줄인지 확인하기. 
		int w = 0;
		while ((br.readLine()) != null) {
			w++; // 한문장을 확인할때마다 w의 값이 증가한다.
		}
		br.close(); 
		// 위에서 사용했던 br은 배열의 동적 할당을 위해 문장이 총 몇줄인지를 파악하기 위해서 사용했다.
		// 주의해야할 점은 BufferedReader로 파일을 읽으면서 
		// 파일의 가장 마지막 줄에 포인트가 가있는 상태이다.(비유 : 커서가 문서의 마지막 줄까지 내려가 있는 상태)
		// BufferedReader를 한번 이상 써야할때는 사용했던 br을 닫아주고 다시 정의해준다.
		
		// 배열 동적할당 해주기.
		String strArr[] = new String[w];
		
		// 파일안에 있는 내용을 배열어 넣어주기
		fr = new FileReader(link);
		br = new BufferedReader(fr);

		String tmpStr = "";
		int j = 0;
		while ((tmpStr = br.readLine()) != null) {
			strArr[j] = tmpStr; //한문장씩 배열에 넣어주기
			j++;
		}
		br.close();
		
		//배열에 있는 내용 출력하기
		for (int i = 0; i < w; i++) {
			System.out.print(strArr[i] + "\n");
		}
	}
}
