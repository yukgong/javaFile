package day09;

import java.io.File;
import java.io.IOException;

public class Ex04FileClass1 {
	public static void main(String[] args) {

		//파일 목록 불러오기
//		File fdir = new File("c:\\"); // 파일 인스턴스 객체 생성
//		
//		String fileList[] = fdir.list();// list()메소드는 c드라이브 안에 있는 파일의 목록을 가져온다.
//		for (int i = 0; i < fileList.length; i++) {
//			System.out.println(fileList[i]);
//		}

		// 파일, 폴더, 그외의 것까지 찾을 때
		File fdir = new File("d:\\tmp\\");

		File fileList[] = fdir.listFiles(); // 동일한 파일 명을 찾을 때 사용할 수 있다.
		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].isFile()) { // 파일일 경우
				System.out.println("[파일]" + fileList[i].getName());

			} else if (fileList[i].isDirectory()) { // 폴더일 경우
				System.out.println("[폴더]" + fileList[i].getName());
			} else {
				System.out.println("[?]" + fileList[i].getName());
			}
		}

		// 파일 생성하기
		String fileStr = "d:\\tmp\\newfile.txt";
		File newFile = new File(fileStr); // 실제 파일을 만드는 것이 아니라 인스턴스 객체만 생성함

		try {
			if (newFile.createNewFile()) {
				System.out.println("파일 생성 성공!");
			} else {
				System.out.println("파일 생성 실패!"); // 같은 파일명을 가질경우 생성 불가. 따라서 실패 메세지 출력
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//파일 조사하기(존재 여부 파악)
		if(newFile.exists()) {
			System.out.println("파일이 존재합니다.");
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		//파일 삭제하기
		if(newFile.delete()) {
			System.out.println("파일을 삭제했습니다.");
		} else {
			System.out.println("파일을 삭제하지 못했습니다.");
		}
		
		//파일 읽기 가능한지 여부 파악
		if(newFile.canRead()) {
			System.out.println("파일을 읽을 수 있습니다.");
		} else {
			System.out.println("파일을 읽을 수 없습니다.");
		}
		
		//파일을 읽기 전용으로 만들기
		newFile.setReadOnly();
		
		//파일 쓰기 가능한지 여부 파악
		if(newFile.canWrite()) {
			System.out.println("파일 쓰기가 가능합니다.");
		}else {
			System.out.println("파일 쓰기가 불가능합니다.");
		}
		
	}
}
