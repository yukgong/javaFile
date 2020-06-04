package day06;

import java.util.Scanner;

/*
 * 0. �����Է� >> �޴� ��ȣ
 * 1. 10������ 2������ ��ȯ�ؼ� ���
 * 2. 2������ 10������ ��ȯ�ؼ� ���
 * 3. 10������ 16������ ��ȯ�ؼ� ���
 * 4. 16������ 10������ ��ȯ�ؼ� ���
 * 5. 2������ 16������ ��ȯ�ؼ� ���
 * 6. 16������ 2������ ��ȯ�ؼ� ���
 * 7. ����
 */

public class Ex02MenuNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {

			// 1. �޴� ��ȣ �����ϱ� //////////////////////////////
			System.out.println("�޴� ��ȣ�� �������ּ���.---------");
			System.out.println("1. 10������ 2������ ��ȯ�ؼ� ���");
			System.out.println("2. 2������ 10������ ��ȯ�ؼ� ���");
			System.out.println("3. 10������ 16������ ��ȯ�ؼ� ���");
			System.out.println("4. 16������ 10������ ��ȯ�ؼ� ���");
			System.out.println("5. 2������ 16������ ��ȯ�ؼ� ���");
			System.out.println("6. 16������ 2������ ��ȯ�ؼ� ���");
			System.out.println("7. ����");
			System.out.println("------------------------");
			int count = scanner.nextInt();

			// 2. ������ �޴� �۵��ϱ� //////////////////////////////

			// 10���� -> 2���� -> (string -> int -> string)
			if (count == 1) {
				System.out.println("10���� -> 2����");

				// �����Է�
				System.out.print("���ڸ� �Է����ּ��� >");
				String num = scanner.next();
				System.out.println();
				
				//��ȯ
				String binaryString = Integer.toBinaryString(Integer.parseInt(num));
				System.out.println("�Է��� �� = \t" + num);
				System.out.println("2���� = \t" + binaryString);
				System.out.println();
				continue;
			}

			// 2���� -> 10���� (string -> int)
			if (count == 2) {
				while (true) {
					// �����Է�
					System.out.print("���ڸ� �Է����ּ��� >");
					String num = scanner.next();
					System.out.println();
					
					//�߸��Է�������
					boolean trueBinary = true;
					for (int i = 0; i < num.length(); i++) {
						char c = num.charAt(i);
						if (!('0' <= c && c <= '1')) {
							trueBinary = false;
							break;
						}
					}

					if (trueBinary == false) {
						System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ֽʽÿ�");
						continue;
					}
					
					//��ȯ
					System.out.println("2���� -> 10����");
					int binaryToDecimal = Integer.parseInt(num, 2);
					System.out.println("�Է��� �� = \t" + num);
					System.out.println("10���� = \t" + binaryToDecimal);
					System.out.println();
					continue;
				}
			}

			// 10���� -> 16���� (string -> int -> string)
			if (count == 3) {
				// �����Է�
				System.out.print("���ڸ� �Է����ּ��� >");
				String num = scanner.next();
				System.out.println();
				
				//��ȯ
				System.out.println("10���� -> 16����");
				String hexString = Integer.toHexString(Integer.parseInt(num));
				System.out.println("�Է��� �� = \t" + num);
				System.out.println("16���� = \t" + hexString);
				System.out.println();
				continue;
			}

			// 16���� -> 10���� (string -> int)
			if (count == 4) {
				// �����Է�
				System.out.print("���ڸ� �Է����ּ��� >");
				String num = scanner.next();
				System.out.println();
				
				//��ȯ
				System.out.println("16���� -> 10����");
				int binaryToHex = Integer.parseInt(num, 16);
				System.out.println("�Է��� �� = \t" + num);
				System.out.println("10���� = \t" + binaryToHex);
				System.out.println();
				continue;
			}

			// 2���� -> 16���� (2 -> 10 -> 16)
			if (count == 5) {
				// �����Է�
				System.out.print("���ڸ� �Է����ּ��� >");
				String num = scanner.next();
				System.out.println();
				
				//��ȯ
				System.out.println("2���� -> 16����");
				int binaryToDecimal = Integer.parseInt(num, 2);
				String binaryToHex = Integer.toHexString(binaryToDecimal);
				System.out.println("�Է��� �� = \t" + num);
				System.out.println("16���� = \t" + binaryToHex);
				System.out.println();
				continue;
			}

			// 16���� -> 2���� (16 -> 10 -> 2)
			if (count == 6) {
				// �����Է�
				System.out.print("���ڸ� �Է����ּ��� >");
				String num = scanner.next();
				System.out.println();
				
				//��ȯ
				System.out.println("16���� -> 2����");
				int binaryToHex = Integer.parseInt(num, 16);
				String hexToBinary = Integer.toBinaryString(binaryToHex);
				System.out.println("�Է��� �� = \t" + num);
				System.out.println("2���� = \t" + hexToBinary);
				System.out.println();
				continue;
			}

			if (count == 7) {
				break;
			}
		}

	}
}
