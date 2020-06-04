package day05Quiz;

import java.util.Scanner;

public class Quiz02_1GradeManage {

	public static void main(String[] args) {
		// 성적 통계 프로그램

		// 초기화
		int sum = 0;
		int avg = 0;

		// 1. 통계를 산출할 학생의 수 입력 받기>
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생 몇 명? > ");
		int studentNum = scanner.nextInt();

		// 2. 배열 동적 할당 > student[통계를 낼 학생 수][이름,국,영,수]
		// ex) 홍길동 국, 영, 수 | 일지매 국, 영, 수
		String studentArr[][] = new String[studentNum][4];

		// 3. 사용자 입력 받기 Start-------------------------------------------

		for (int i = 0; i < studentArr.length; i++) {
			// [i][0] 에 이름 입력 >
			System.out.println((i + 1) + "번째 학생 이름 > ");
			studentArr[i][0] = scanner.next();

			// 국어 점수 입력-----------------------------------------------
			boolean loop = true;
			while (loop == true) {
				// [i][1]에 국어 점수 입력
				System.out.println((i + 1) + "번째 학생의 국어 점수 > ");
				studentArr[i][1] = scanner.next();

				out: while (true) {
					// 입력 받은 내용이 숫자인가?
					for (int j = 0; j < studentArr[i][1].length(); j++) {
						// String to char
						char c = studentArr[i][1].charAt(j);
						if (!('0' <= c && c <= '9')) {
							System.out.println("잘못입력했습니다.");
							break out; // 아니라면 처음부터 다시 물어보기
						}
					}
					// 입력 받은 내용이 숫자가 맞다면 1~100범위에 있는가?
					// string to int
					String score = studentArr[i][1];
					int stringToInt = Integer.parseInt(score);
					if (stringToInt <= 0 || stringToInt > 100) {
						System.out.println("범위를 초과했습니다.");
						break out; // 아니라면 처음부터 다시 물어보기
					} else { // 숫자고, 1~100범위에 있다면 다음으로 넘어가기
						loop = false;
						break out;
					}
				}
			}

			// 영어 점수 입력-----------------------------------------------
			loop = true;
			while (loop == true) {
				// [i][1]에 영어 점수 입력
				System.out.println((i + 1) + "번째 학생의 영어 점수 > ");
				studentArr[i][2] = scanner.next();

				out: while (true) {
					// 입력 받은 내용이 숫자인가?
					for (int j = 0; j < studentArr[i][2].length(); j++) {
						// String to char
						char c = studentArr[i][2].charAt(j);
						if (!('0' <= c && c <= '9')) {
							System.out.println("잘못입력했습니다.");
							break out; // 아니라면 처음부터 다시 물어보기
						}
					}
					// 입력 받은 내용이 숫자가 맞다면 1~100범위에 있는가?
					// string to int
					String score = studentArr[i][2];
					int stringToInt = Integer.parseInt(score);
					if (stringToInt <= 0 || stringToInt > 100) {
						System.out.println("범위를 초과했습니다.");
						break out; // 아니라면 처음부터 다시 물어보기
					} else { // 숫자고, 1~100범위에 있다면 다음으로 넘어가기
						loop = false;
						break out;
					}
				}
			}

			// 수학 점수 입력-----------------------------------------------
			loop = true;
			while (loop == true) {
				// [i][1]에 수학 점수 입력
				System.out.println((i + 1) + "번째 학생의 수학 점수 > ");
				studentArr[i][3] = scanner.next();

				out: while (true) {
					// 입력 받은 내용이 숫자인가?
					for (int j = 0; j < studentArr[i][3].length(); j++) {
						// String to char
						char c = studentArr[i][3].charAt(j);
						if (!('0' <= c && c <= '9')) {
							System.out.println("잘못입력했습니다.");
							break out; // 아니라면 처음부터 다시 물어보기
						}
					}
					// 입력 받은 내용이 숫자가 맞다면 1~100범위에 있는가?
					// string to int
					String score = studentArr[i][3];
					int stringToInt = Integer.parseInt(score);
					if (stringToInt <= 0 || stringToInt > 100) {
						System.out.println("범위를 초과했습니다.");
						break out; // 아니라면 처음부터 다시 물어보기
					} else { // 숫자고, 1~100범위에 있다면 다음으로 넘어가기
						loop = false;
						break out;
					}
				}
			}
		}

		// 4. 국어, 영어, 수학의 최고/최저 점수 산출하기 Start---------------------

		int maxKorean, maxEnglish, maxMath, minKorean, minEnglish, minMath;
		maxKorean = maxEnglish = maxMath = 0;
		String koreanScore1 = studentArr[0][1];
		String englishScore1 = studentArr[0][2];
		String mathScore1 = studentArr[0][3];
		int koreanCompare1 = Integer.parseInt(koreanScore1);
		int englishCompare1 = Integer.parseInt(englishScore1);
		int mathCompare1 = Integer.parseInt(mathScore1);
		minKorean = koreanCompare1;
		minEnglish = englishCompare1;
		minMath = mathCompare1;

		for (int i = 0; i < studentArr.length; i++) {
			// 문자열을 숫자로 바꿔주기
			String koreanScore = studentArr[i][1];
			String englishScore = studentArr[i][2];
			String mathScore = studentArr[i][3];
			int koreanCompare = Integer.parseInt(koreanScore);
			int englishCompare = Integer.parseInt(englishScore);
			int mathCompare = Integer.parseInt(mathScore);

			// 국어 점수의 최고/최저점 --------------
			// compare의 값이 maxKorean의 값보다 크면 maxKorean에 compare값 저장
			if (koreanCompare > maxKorean) {
				maxKorean = koreanCompare;
			}
			if (koreanCompare < minKorean) {
				minKorean = koreanCompare;
			}

			// 영어 점수의 최고/최저점 --------------
			if (englishCompare > maxEnglish) {
				maxEnglish = englishCompare;
			}
			if (englishCompare < minKorean) {
				minEnglish = englishCompare;
			}

			// 수학 점수의 최고/최저점 --------------
			if (mathCompare > maxMath) {
				maxMath = mathCompare;
			}
			if (mathCompare < minMath) {
				minMath = mathCompare;
			}
		}


		// 5. 모든 점수의 총합 Strat ---------------------------------------
		
		for (int i = 0; i < studentNum; i++) {
			for (int j = 1; j < 4; j++) {
				// 문자열을 숫자로 변환하기
				int stringToInt = Integer.parseInt(studentArr[i][j]);
				// 변환한 숫자를 합하기
				sum += stringToInt;
			}
		}

		// 6. 학생 수의 따른 평균 구하기---------------------------------------
		avg = sum / studentNum;

		// 7. 출력하기-------------------------------------------------
		System.out.println("국어 최고점 = " + maxKorean + " 최저점 = " + minKorean);
		System.out.println("영어 최고점 = " + maxEnglish + " 최저점 = " + minEnglish);
		System.out.println("수학 최고점 = " + maxMath + " 최저점 = " + minMath);
		System.out.println("모든 점수의 총합 = " + sum);
		System.out.println("평균 점수 = " + avg);
	}
}
