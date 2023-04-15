package except;

import java.util.Scanner;

public class Try2 {
	public static void main(String[] args) {
		// #1
		// try-catch를 사용해서 나누기를 해보자
		// 숫자 2개를 나누기하되
		// 0이 들어올 수 있으니까 try로 예외처리
		
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			System.out.println("첫번째 숫자를 입력하세요>>");
//			int num1 = sc.nextInt();
//			System.out.println("두번째 숫자를 입력하세요>>");
//			int num2 = sc.nextInt();
//			Exam ex = new Exam();
//			try {
//				ex.div(num1, num2);			
//			} catch(Exception e) {
//				System.out.println("0으로는 나눌 수 없어요! 다시해!");
//			}
//
//	
//			// #2
//			// int a = sc.nextInt();		에 대한 예외처리 (숫자를 입력해야하는 함수에 문자열을 입력할 수 있음)
//			System.out.println("숫자를 입력하세요>>");
//			int a = 0;
//			try {
//				a = sc.nextInt();
//				System.out.println(a);
//			}
//			catch(Exception e) {
//				System.out.println("숫자를 쓰라고 숫자를!");
//			}
//		}
		// 형변환 String -> int
		int c = 0;
		String str = "글자";
		try {
			c = Integer.parseInt(str);
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("숫자만 가능 "+e);
		}
}
}
class Exam {
	public void div(int num1, int num2) {
		System.out.println(num1/num2);
	}
}