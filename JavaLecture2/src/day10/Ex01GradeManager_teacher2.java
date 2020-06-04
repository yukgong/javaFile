package day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex01GradeManager_teacher2 {
	public static void main(String[] args) throws Exception {
		// 학생 성적 관리

		/*
		 * String student[][];
		 * 
		 * 메뉴 ------ 1. 학생 정보 추가 insert(ex 홍길동, 나이, 영어, 수학) 2. 학생 정보 삭제 delete - 학생 이름
		 * 검색 -> "" 빈문자로 바꾸기 3. 학생 정보 검색 search - 학생 이름 검색 4. 학생 정보 수정 update - 학생 이름을
		 * 검색해서 정보 수정하기 5. 학생 정보 모두 출력 6. 과목의 총점 1. 영어, 2, 수학 7. 과목의 평균 8. 성적순으로 정렬 출력
		 * 9. 파일 저장하기 10. 종료
		 */

		// 초기화
		Scanner sc = new Scanner(System.in);
		int choice;

//		String student[][] = { { "홍길동", "24", "100", "95" }, { "임꺽정", "24", "40", "40" }, { "존도", "24", "90", "90" } };
		String student[][] = fileLoad();

		out: while (true) {

			// 파일과 동기화

//			fileLoad(student);

			// 선택할 메뉴 보여주기
			System.out.println("------메뉴------");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 정보 삭제 ");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 모두 출력");
			System.out.println("6. 과목의 총점");
			System.out.println("7. 과목의 평균");
			System.out.println("8. 성적순으로 정렬 출력");
			System.out.println("9. 종료");
			System.out.println("--------------\n");
			System.out.println("메뉴 번호를 입력해주세요");
			System.out.print(">>>");
			choice = sc.nextInt();

			switch (choice) {
			case 1: // 학생 추가
				insert(student);
				break;
			case 2: // 학생 삭제
				delete(student);
				break;
			case 3:
				search(student);
				break;
			case 4:
				update(student);
				break;
			case 5:
				allPrint(student);
				break;
			case 6:
				sum(student);
				break;

			case 7:
				avg(student);
				break;

			case 8:
				sorting(student);
				break;

			case 9:
				break out;
			}
		}
	}

	// input
	// return : string Value
	static String input(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		String str = sc.next();

		return str;
	}

	// add student
	static void insert(String student[][]) throws Exception {

		int findIndex = -1;
		for (int i = 0; i < student.length; i++) {
			if (student[i][0] == null || student[i][0].equals("")) { // i행에 0열이 비어 있으면
				findIndex = i;
				break;
			}
		}

		// test code
		System.out.println(findIndex + "번 정보 입력하기");

		String name = input("이름:");
		String age = input("나이:");
		String english = input("영어:");
		String math = input("수학:");

		student[findIndex][0] = name;
		student[findIndex][1] = age;
		student[findIndex][2] = english;
		student[findIndex][3] = math;

		fileSave(student);

		System.out.println(student[findIndex][0] + " 학생의 정보가 등록되었습니다." + "\n");
	}

	static void delete(String student[][]) {
		String name = input("삭제할 학생의 이름 : ");

		int findIndex = getSearchIndex(student, name);

		if (findIndex != -1) { // findIndex가 -1이 아니면 배열에서 name과 동일한 값을 찾았다는 뜻.
			System.out.println(name + " 학생의 데이터를 삭제합니다.");
			student[findIndex][0] = "";
			student[findIndex][1] = "";
			student[findIndex][2] = "";
			student[findIndex][3] = "";
		} else {
			System.out.println("데이터를 찾을 수 없습니다.");
		}
	}

	static void search(String student[][]) {
		String name = input("검색할 학생의 이름 : ");

		int findIndex = getSearchIndex(student, name);

		if (findIndex != -1) { // findIndex가 -1이 아니면 배열에서 name과 동일한 값을 찾았다는 뜻.
			System.out.println("데이터를 찾았습니다.");
			System.out.println("이름 :" + student[findIndex][0]);
			System.out.println("나이 :" + student[findIndex][1]);
			System.out.println("영어 :" + student[findIndex][2]);
			System.out.println("수학 :" + student[findIndex][3]);
		} else {
			System.out.println("데이터를 찾을 수 없습니다.");
		}

	}

	static void update(String student[][]) throws Exception {
		String name = input("수정할 학생의 이름 : ");
		int findIndex = getSearchIndex(student, name);

		if (findIndex != -1) { // findIndex가 -1이 아니면 배열에서 name과 동일한 값을 찾았다는 뜻.
			System.out.println("수정 데이터를 입력해 주십시오.");
			student[findIndex][2] = input("영어: ");
			student[findIndex][3] = input("수학: ");
			System.out.println("데이터를 수정했습니다.");
			fileSave(student);
		} else {
			System.out.println("데이터를 찾을 수 없습니다.");
		}
	}

	static void allPrint(String student[][]) {
		System.out.println("이름\t나이\t영어\t수학\t");
		System.out.println("--------------------------------");
		for (int i = 0; i < student.length; i++) {
			if (!(student[i][0].equals(""))) {
				for (int j = 0; j < student[0].length; j++) {
					System.out.print(student[i][j] + "\t");
				}
				System.out.println();
			}
		}
		System.out.println();
	}

	static void sum(String student[][]) {
		// 학생 수는 몇명인가?
		int count = 0;
		for (int i = 0; i < student.length; i++) {
			if (!(student[i][0].equals(""))) {
				count++;
			}
		}
		System.out.println("등록된 학생수:" + count);
		int sumArr[] = new int[count];

		// 과목 선택하기
		String choice = input("합계를 구할 과목을 선택해 주세요 (1. 영어, 2. 수학)");
		int n = Integer.parseInt(choice);

		// 선택한 과목 더하기
		int sum = 0;
		for (int i = 0; i < sumArr.length; i++) { // 영어 student[][2], 수학 student[][3]
			if (!(student[i][0].equals(""))) {
				sum += Integer.parseInt(student[i][n + 1]);
			}
		}

		if (n == 1)
			System.out.println("영어 총점 :" + sum + "\n");
		else
			System.out.println("수학 총점 :" + sum + "\n");
	}

	static void avg(String student[][]) {
		// 학생 수는 몇명인가?
		int count = 0;
		for (int i = 0; i < student.length; i++) {
			if (!(student[i][0].equals(""))) {
				count++;
			}
		}
		System.out.println("등록된 학생수:" + count);
		int sumArr[] = new int[count];

		// 과목 선택하기
		String choice = input("평균을 구할 과목을 선택해 주세요 (1. 영어, 2. 수학)");
		int n = Integer.parseInt(choice);

		// 선택한 과목 더하기
		int sum = 0;
		for (int i = 0; i < sumArr.length; i++) { // 영어 student[][2], 수학 student[][3]
			if (!(student[i][0].equals(""))) {
				sum += Integer.parseInt(student[i][n + 1]);
			}
		}

		// 평균값 구하기
		double avg = (double) sum / count;

		// 결과 출력
		if (n == 1)
			System.out.println("영어 총점 :" + avg + "\n");
		else
			System.out.println("수학 총점 :" + avg + "\n");
	}

	// 성적순 정렬
	static void sorting(String student[][]) throws Exception {
		String sortDatas[][] = new String[student.length][student[0].length];

		// 원본 데이터 값을 바꾸지 않기 위해 내용만 가져와서 사용한다.
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[0].length; j++) {
				sortDatas[i][j] = student[i][j];
			}
		}

		// student[][2] -> 내림차순으로 결과 출력하기
		String temp[] = null;
		for (int i = 0; i < sortDatas.length - 1; i++) {
				for (int j = i + 1; j < sortDatas.length; j++) {
					if (!(sortDatas[i][0].equals("") || sortDatas[j][0].equals(""))) {
					int num1 = Integer.parseInt(sortDatas[i][2]);
					int num2 = Integer.parseInt(sortDatas[j][2]);
					if (num1 > num2) {
						temp = sortDatas[i];
						sortDatas[i] = sortDatas[j];
						sortDatas[j] = temp;
					}
				}
			}
		}
		// 결과 출력하기
		System.out.println("이름\t나이\t영어\t수학\t");
		System.out.println("--------------------------------");
		for (int i = 0; i < sortDatas.length; i++) {
			if (!(sortDatas[i][0].equals(""))) {
				for (int j = 0; j < sortDatas[0].length; j++) {
					System.out.print(sortDatas[i][j] + "\t");
				}
				System.out.println();
			}
		}
	}

	// --------------------------------------------

	// 파일 저장하기
	static void fileSave(String student[][]) throws Exception {

		// 학생수 파악하기
		int count = 0;
		for (int i = 0; i < student.length; i++) {
			if (!student[i][0].equals("")) { // student[i][0].equals("") == false
				count++;
			}
		}

		// 새로운 배열에 내용 담기
		String saveData[] = new String[count];
		for (int i = 0; i < saveData.length; i++) {
			saveData[i] = student[i][0] + "-" + student[i][1] + "-" + student[i][2] + "-" + student[i][3];
		}

		// 특정 위치에 있는 파일을 찾아 쓰기용 셋팅을 한다.
		File file = new File("d:/tmp/student.txt");
		FileWriter fw = new FileWriter(file); // 파일 내용을 써줄 수 있도록 객체를 생성한다.
		BufferedWriter bw = new BufferedWriter(fw); // 특정 파일에 문장 단위로 쓰기 위한 객체 생성
		PrintWriter pw = new PrintWriter(bw); // 문자열을 출력하는 객체 생성

		// 배열의 내용을 파일에 넣어준다.
		String str = "";
		for (int i = 0; i < saveData.length; i++) {
			pw.println(saveData[i]);
		}
		pw.close();
	}

	// 데이터 불러오기
	static String[][] fileLoad() throws Exception {

		// 초기화
		String str[] = null;
		int lineCount = 0;
		String student[][] = new String[20][4];
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length; j++) {
				student[i][j] = "";
			}
		}

		// 파일 읽기
		File file = new File("d:/tmp/student.txt");
		FileReader fr = new FileReader(file);

		// 데이터 갯수 파악
		int count = 0;
		String s;
		BufferedReader br = new BufferedReader(fr);
		while ((s = br.readLine()) != null) {
			count++;
		}
		br.close();

		// 할당
		str = new String[count];

		// 데이터를 배열에 저장
		fr = new FileReader(file);
		br = new BufferedReader(fr);
		while ((s = br.readLine()) != null) {
			str[lineCount] = s;
			lineCount++;
		}
		br.close();


		// 파일 내용을 배열에 넣기
		for (int i = 0; i < str.length; i++) {
			s = str[i];
			String split[] = s.split("-");

			student[i][0] = split[0];
			student[i][1] = split[1];
			student[i][2] = split[2];
			student[i][3] = split[3];
		}
		// student[][]배열이 return 되도록
		return student;
	}

	// --------------------------------------------

	static int getSearchIndex(String student[][], String name) { // 직접적으로 사용되지 않지만 메소드에 기능으로 사용되는 메소드를 유틸리라고 한다.
		int findIndex = -1; // 값을 0으로 주지 않는 이유 : 아무것도 못찾았을때 값이 0이 나오면, 배열에 0는 다른 값이 채워져 있어 잘못된 결과가 나온다.
		for (int i = 0; i < student.length; i++) {
			if (student[i][0].equals(name)) {
				findIndex = i;
				break;
			}
		}
		return findIndex;
	}
}