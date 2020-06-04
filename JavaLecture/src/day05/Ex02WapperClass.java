package day05;

public class Ex02WapperClass {
	public static void main(String[] args) {
		// 臾몄옄�뿴�쓣 �젙�닔濡� 諛붽씀湲�
		String strNum = "234";
		int cNum = Integer.parseInt(strNum);
		System.out.println("cNum = " + (cNum + 1));

		// 臾몄옄�뿴�쓣 �떎�닔濡� 諛붽씀湲�
		String dstrNum = "123.456";
		double dNum = Double.parseDouble(dstrNum);
		System.out.println("dNum= " + (dNum + 1.13));

		// 10吏꾩닔 �넂 2吏꾩닔
		int i1 = 12;
		String binaryString = Integer.toBinaryString(i1);
		System.out.println(i1 + "�쓣 10吏꾩닔 �넂 2吏꾩닔 = " + binaryString);

		// 2吏꾩닔 �넂 10吏꾩닔
		String i2 = "11001010";
		int binaryToDecimal = Integer.parseInt(i2, 2);
		System.out.println(i2 + "�쓣 2吏꾩닔 �넂 10吏꾩닔 = " + binaryToDecimal);

		//10吏꾩닔 �넂 16吏꾩닔
		int i3 = 127;
		String hexString = Integer.toHexString(i3);
		System.out.println(i3 + "�쓣 10吏꾩닔 �넂 16吏꾩닔 = " + hexString);
		
		//16吏꾩닔 -> 10吏꾩닔
		String i4 = "C7";
		int binaryToHex = Integer.parseInt(i4, 16);
		System.out.println(i4 + "�쓣 16吏꾩닔 �넂 10吏꾩닔 = " + binaryToHex);

		int Array2[][] = new int[3][4];
		
		int Array1[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		for (int i = 0; i < Array1.length; i++) { // Array1.length -> 3
			for (int j = 0; j < Array1[0].length; j++) { // Array1[0].length ->4
				System.out.println("Array1[" + i + "][" + j + "] = "+Array1[i][j]);
				
			}
		}
	}
}
