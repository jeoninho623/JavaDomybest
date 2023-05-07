package iostream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Logfile {
	public static void main(String[] args) {
		// log파일 (데이터를 주고받은 이력을 기록)
		// 일반적으로 통신이나 stream 작업을 할 때 오류가 많이 발생
		// 입력

		// 무한으로 입력하고 출력시키는 프로그램(==> 출력 시키기전에 입력내용을 파일에 기록)
		Scanner sc = new Scanner(System.in);
		MyFile myFile = new MyFile();
		String str = "";

		while (true) {
			System.out.println("출력할 내용을 입력하세요>>");
			str = sc.nextLine(); // 입력
			// str 변수를 log파일에 기록
			myFile.putFile("C:\\log\\log.txt", str);
			
			System.out.println(str); // 출력
		}
	}
}

class MyFile {
	public void createFile(String path) {
		Scanner scan = new Scanner(System.in);
		System.out.println("파일명을 입력하세요>>");
		String filename = scan.next();
		String filepath = path + filename + ".txt";
		File file = new File(path + filename + ".txt");

		if (file.exists()) {
			System.out.println("이미 존재하네요");
			return;
		}
		try {
			file.createNewFile();
			System.out.println(filename + "파일을 생성했습니다!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readFile(String path) {
		FileInputStream fileIs = null;

		try {
			fileIs = new FileInputStream(path);
			InputStreamReader inputSr = new InputStreamReader(fileIs, "UTF-8");
			BufferedReader Buff = new BufferedReader(inputSr);
			String str = null;

			while ((str = Buff.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일 읽기 실패!");
		} catch (Exception e) {
			System.out.println("변환 실패!");
		} finally {
			try {
				fileIs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileFound(String path) {
		System.out.println(path + "안에 있는 파일을 검색");

		// File 클래스 이용
		File file = new File(path); // 해당 경로안에 모든 파일명이 배열형태로 저장
		for (String name : file.list()) {
			System.out.println("파일: " + name);
		}
	}

	public void putFile(String pathfile, String msg) {
		FileOutputStream fos = null;
		Scanner scan = new Scanner(System.in);
		try {
			fos = new FileOutputStream(pathfile, true); // 기존에 있는 내용에 이어쓰기 가능
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		msg += '\n'; // 줄바꿈

		// 파일로 옮기기 위해선 byte단위로 변환해야함
		byte[] byteArray = msg.getBytes(); // String ==> byte[]
		try {
			fos.write(byteArray);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void deleteFile(String _file) {
		File file = new File(_file);
		boolean result = file.delete();

		if (result == true) {
			System.out.println("삭제 성공!");
		} else {
			System.out.println("삭제 실패!");
		}
	}
}