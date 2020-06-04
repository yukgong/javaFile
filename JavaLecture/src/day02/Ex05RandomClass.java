package day02;

public class Ex05RandomClass {
	public static void main(String[] args) {
		/*
		 * Random 난수 : 무작위  <-> Pattern 1 ~ 5
		 */

		int rNum; // 난수를 넣어둘 공간 만들기
		
		// 랜덤 함수 사용 선언
		rNum = (int) (Math.random() * 5);
		// Math.random()은 기본적으로 더블형이라 rNum에 담기지 않기 때문에 강제 형변환을 시켜준다.
		// 5: 0에서 4범위의 숫자를 뽑으라는 뜻을 가진다.
		System.out.println("rNum =" + rNum);

		// 0 ~ 9
		rNum = (int) (Math.random() * 10);
		System.out.println("rNum =" + rNum);

		// 10 ~ 20
		rNum = (int) (Math.random() * 11) + 10;
		System.out.println("rNum =" + rNum);

		// 10 20 30 40 50
		rNum = ((int) (Math.random() * 5) + 1) * 10;
		System.out.println("rNum =" + rNum);

		// -1 0 1
		rNum = (int) (Math.random() * 3) - 1;
		System.out.println("rNum =" + rNum);
		
		int x = (int) (Math.random() * 3) - 1;
		int y = (int) (Math.random() * 3) - 1;
		// xy 좌표에 대입하는 경우에 사용될 수 있다. 게임에서의 경우 몹이 이동할 수 있도록 랜덤 로직을 이용한다.
	}
}
