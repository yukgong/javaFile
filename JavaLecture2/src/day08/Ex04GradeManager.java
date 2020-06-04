package day08;

import java.util.Scanner;

public class Ex04GradeManager {
	public static void main(String[] args) {
		// 학생 성적 관리

//		/*
//		 * String student[][];
//		 * 
//		 * 메뉴 ------ 
//		 * 1. 학생 정보 추가 insert(ex 홍길동, 나이, 영어, 수학) 
//		 * 2. 학생 정보 삭제 delete - 학생 이름 검색 -> "" 빈문자로 바꾸기
//		 * 3. 학생 정보 검색 search - 학생 이름 검색
//		 * 4. 학생 정보 수정 update - 학생 이름을 검색해서 정보 수정하기
//		 * 5. 학생 정보 모두 출력
//		 * 6. 과목의 총점 1. 영어, 2, 수학
//		 * 7. 과목의 평균
//		 * 8. 성적순으로 정렬 출력
//		 */

		// 초기화
		Scanner sc = new Scanner(System.in);
		String student[][] = new String[20][4];
		int choice;

		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length; j++) {
				student[i][j] = "";
			}
		}

		out: while (true) {
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
				addStudent(student);
				break;
			case 2: // 학생 삭제
				deleteStudent(student);
				break;
			case 3:
				findStudent(student);
				break;
			case 4:
				updateStudent(student);
				break;
			case 5:
				totalInfoPrint(student);
				break;
			case 6:
				sumSubject(student);
				break;

			case 7:
				avgSubject(student);
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
	static void addStudent(String student[][]) {

		int findIndex = -1;
		for (int i = 0; i < student.length; i++) {
			if (student[i][0].equals("")) { // i행에 0열이 비어 있으면
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

		System.out.println(student[findIndex][0] + "학생의 정보가 수정되었습니다." + "\n");
	}

	// delete Student
	// return : 삭제할 학생이 등록되어 있으면 true 아니면 false
	static boolean deleteStudent(String student[][]) {

		String name = input("삭제할 학생 이름:");

		for (int i = 0; i < student.length; i++) {
			if (name.equals(student[i][0])) {
				String yesOrNo = input(name + "학생의 정보를 삭제하시겠습니까?(Y/N)");

				if (yesOrNo.equals("Y") || yesOrNo.equals("y")) {
					student[i][0] = "";
					student[i][1] = "";
					student[i][2] = "";
					student[i][3] = "";
					return true;
				} else if (yesOrNo.equals("N") || yesOrNo.equals("n")) {
					System.out.println("메뉴로 돌아갑니다.\n");
					return true;
				} else {
					System.out.println("잘못입력했습니다.\n");
					i--;
				}
			}
		}
		System.out.println(name + "으로 등록된 정보가 없습니다.");
		return false;
	}

	// find Student
	static boolean findStudent(String student[][]) {
		String name = input("검색할 학생 이름:");

		for (int i = 0; i < student.length; i++) {
			if (name.equals(student[i][0])) {
				System.out.println("이름\t나이\t영어\t수학\t");
				System.out.println("--------------------------------");
				for (int j = 0; j < student[0].length; j++) {
					System.out.print(student[i][j] + "\t");
				}
				System.out.println();
				return true;
			}
		}

		System.out.println(name + "으로 등록된 정보가 없습니다.");
		return false;
	}

	// update Student
	static void updateStudent(String student[][]) {
		String name = input("수정할 학생 이름:");

		for (int i = 0; i < student.length; i++) {
			if (name.equals(student[i][0])) {

				System.out.println("정보를 수정해주세요.");

				name = input("이름:");
				String age = input("나이:");
				String english = input("영어:");
				String math = input("수학:");

				student[i][0] = name;
				student[i][1] = age;
				student[i][2] = english;
				student[i][3] = math;

				System.out.println(student[i][0] + "학생의 정보가 수정되었습니다." + "\n");
				break;
			}
		}

		System.out.println(name + "으로 등록된 정보가 없습니다.");

	}

	// 학생 정보 모두 출력
	static void totalInfoPrint(String student[][]) {
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

	// 과목 점수 합산
	static void sumSubject(String student[][]) {
		//확인할 과목 선택하기
		String choice = input("총점을 확인할 과목을 선택해 주세요 (1. 영어, 2. 수학)");
		int n = Integer.parseInt(choice);
		
		//특정 과목 성적 합산하기 : 합산 함수를 호출해 n번 과목의 성적 합산하기
		int sumResult = sum(student, n);
		
		//선택한 번호에 따라 수학, 영어 과목인지를 파악해 결과를 출력한다.
		if (n == 1) {
			System.out.println("영어 과목의 총점 :" + sumResult + "\n");
		} else if (n == 2) {
			System.out.println("수학 과목의 총점 :" + sumResult + "\n");
		}
	}

	// 합산 함수
	static int sum(String student[][], int n) {
		int sum = 0;
		for (int i = 0; i < student.length; i++) {
			if (!(student[i][0].equals(""))) {
				sum += Integer.parseInt(student[i][n + 1]);
			}
		}
		return sum;
	}

	// 과목 평균 구하는 함수
	static void avgSubject(String student[][]) {
		double avg = 0;
		
		//확인할 과목 선택하기
		String choice = input("평균을 확인할 과목을 선택해 주세요 (1. 영어, 2. 수학)");
		int n = Integer.parseInt(choice); // 사용자가 입력한 문자를 숫자로 바꾸기

		//특정 과목 성적 합산하기 : 합산 함수를 호출해 n번 과목의 성적 합산하기
		int sumResult = sum(student, n);
		
		//학생 숫자 구하기 :공백이 아닌 배열을 찾으면 학생 숫자를 +1한다.
		int studentNum = 0;
		for (int i = 0; i < student.length; i++) {
			if (!(student[i][0].equals(""))) {
				studentNum += 1;
			}
		}
		
		//평균값을 구한다.
		avg = sumResult / studentNum;
		
		//선택한 번호에 따라 수학, 영어 과목인지를 파악해 결과를 출력한다.
		if (n == 1) {
			System.out.println("영어 과목의 총점 :" + avg + "\n");
		} else if (n == 2) {
			System.out.println("수학 과목의 총점 :" + avg + "\n");
		}
	}

	// 성적순으로 정렬 출력
	static void sorting(String student[][]) {
		int gradeSum[][] = new int[student.length][1];
		
		//원본 데이터 값을 바꾸지 않기 위해 배열의 값 자체를 참조한다.
		String copyStudentArr[][] = new String [student.length][4];
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[0].length; j++) {
				copyStudentArr[i][j] = student[i][j];
			}
		}

		// 성적은 숫자이므로 숫자를 비교하기 위해 스트링으로 되어 있는 배열을 숫자로 만들어준다.
		// 학생별로 성적의 총점을 계산해 gradeSum 배열에 넣어준다.
		for (int i = 0; i < student.length; i++) {
			if (!(student[i][0].equals(""))) {
				int a = Integer.parseInt(student[i][2]);
				int b = Integer.parseInt(student[i][3]);
				gradeSum[i][0] = a + b;
			}
		}

		// 0번째 학생부터 옆사람과 비교해 성적이 높은 사람이 앞에 오도록 swap을 사용해 정렬한다.
		String temp[][] = new String[student.length][4]; // swap을 하기 위해 빈 템플릿 배열을 만들어준다.
		
		for (int i = 0; i < student.length - 1; i++) {
			for (int j = i + 1; j < student.length; j++) {
				if (!(student[i][0].equals(""))) {						//student 배열을 확인해서 공백이 없고...
					if (gradeSum[i][0] > gradeSum[j][0]) {				//0번 학생의 점수 a와 1번 학생의 점수 b를 비교해 a가 더 크면..
						for (int k = 0; k < student[0].length; k++) {	//swap 하기
							temp[i][k] = copyStudentArr[i][k];
							copyStudentArr[i][k] = copyStudentArr[j][k];
							copyStudentArr[j][k] = temp[i][k];
						}
					}
				}
			}
		}
		
		//배열을 확인해 공백이 아닌지 확인하고, 공백이 아닌 배열의 성적순으로 정렬한 내용을 화면에 출력한다.
		System.out.println("이름\t나이\t영어\t수학\t");
		System.out.println("--------------------------------");
		for (int i = 0; i < copyStudentArr.length; i++) {
			if (!(copyStudentArr[i][0].equals(""))) {
				for (int j = 0; j < copyStudentArr[0].length; j++) {
					System.out.print(copyStudentArr[i][j] + "\t");
				}
				System.out.println();
			}
		}
	}
}
