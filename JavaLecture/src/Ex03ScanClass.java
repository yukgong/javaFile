import java.util.Scanner;

public class Ex03ScanClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		// ����
		boolean b;
		System.out.println("true/false�� �Է��ϼ��� : ");
		b = scan.nextBoolean(); // true/false
		
		System.out.println(b+"�� �Է��߽��ϴ�.");
		
		
		
		//������
		int number;
		System.out.println("������ �Է��ϼ��� :");
		number = scan.nextInt();
		System.out.println(number+"�� �Է��߽��ϴ�.");
		
		//�Ǽ���
		double d;
		System.out.println("�Ǽ��� �Է��ϼ��� :");
		d = scan.nextDouble();
		System.out.println(d+"�� �Է��߽��ϴ�.");
		
		
		//���ڿ�
		String str;
		System.out.println("���ڿ��� �Է��ϼ��� :");
		str= scan.next();
		System.out.println(str+"�� �Է��߽��ϴ�.");
		
		scan.close();
	}
}
