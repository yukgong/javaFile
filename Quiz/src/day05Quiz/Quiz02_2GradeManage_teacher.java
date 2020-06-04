package day05Quiz;

import java.util.Scanner;

public class Quiz02_2GradeManage_teacher {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// 학생 성적 관리용 2차원 배열
		// String -> 이름, 숫자 모두를 취급할 수 있다. -> 숫자는 parseInt로 변환할 수 있다.
		// int는 숫자만 취급할 수 있으므로 적합하지 않다.

		// 선언부 Start---------------------------

		// 학생수, 이름 + 과목(국어, 영어, 수학)
		String student[][] = null;
		int count; // 학생수

		// input Strat---------------------------

		// 1. 학생 수 입력
		System.out.println("학생 수를 입력 = ");
		count = scanner.nextInt();

		// 2. 동적 할당
		student = new String[count][4];

		// 3. 입력 : 이름, 국어, 영어, 수학
		for (int i = 0; i < student.length; i++) {
			System.out.println((i + 1) + "번째 학생 ---------");

			// 이름-----------------------------
			System.out.print("이름 :");
			String name = scanner.next();

			// 국어-----------------------------
			String lang = "";

			while (true) {
				System.out.print("국어:");
				lang = scanner.next();

				// 숫자인지 아닌지

				boolean check = false;
				for (int j = 0; j < lang.length(); j++) {
					char c = lang.charAt(j);
					if ((int) c < 48 || (int) c > 57) {
						check = true;
						break;
					}
				}
				if (check == true) {
					System.out.println("잘못 입력했습니다.다시 입력해 주십시오");
					continue;
				}

				// > 1 ~ 100 사이의 숫자 인가?
				int numLang = Integer.parseInt(lang);
				if (numLang < 0 || numLang > 100) {
					System.out.println("범위를 초과했습니다. 다시 입력해주세요.");
					continue;
				}
				break;
			}

			// 영어-----------------------------
			System.out.print("영어:");
			String english = scanner.next();

			// 수학-----------------------------
			System.out.print("수학:");
			String math = scanner.next();

			// 데이터를 배열에 대입
			student[i][0] = name;
			student[i][1] = lang;
			student[i][2] = english;
			student[i][3] = math;
		}

//		//input 영역 test 출력 
//		for (int i = 0; i < student.length; i++) {
//			for (int j = 0; j < student[0].length; j++) {
//				System.out.print(student[i][j] + "\t");
//			}
//			System.out.println();
//		}

		// ------------------------------------------------------

		// 4. 국어, 수학, 영어 최고 점수 = max
		int studentCount[][] = new int[student.length][3];
		for (int k = 0; k < student.length; k++) {
			studentCount[k][0] = Integer.parseInt(student[k][1]); // 국어
			studentCount[k][1] = Integer.parseInt(student[k][2]); // 영어
			studentCount[k][2] = Integer.parseInt(student[k][3]); // 수학

		}

		int max = 0;
		for (int i = 0; i < student.length; i++) {
			if (max < studentCount[i][0]) {
				max = studentCount[i][0];
			}
		}

		// 5. 국어, 수학, 영어 최저 점수 = min
		int min = studentCount[0][1];
		for (int i = 0; i < student.length; i++) {
			if (min > studentCount[i][0]) {
				min = studentCount[i][0];
			}
		}

		// 6. 모든 점수의 종합
		int sum = 0;
		for (int i = 0; i < studentCount.length; i++) {
			for (int j = 0; j < studentCount[0].length; j++) {
				sum += studentCount[i][j];
			}
		}

		// 7. 학생 수에 따른 평균
		double avg = (double) sum / student.length;

		// print---------------------------------------------------
		System.out.println("국어 최고점수 :" + max);
		System.out.println("국어 최저점수 :" + min);
		System.out.println("점수 총합 :" + sum);
		System.out.println("평균 점수:" + avg);

	}
}
