package condition;

import java.util.Scanner;

public class Ifelse3 {
	public static void main(String[] args) {
		// Q1. 20세 이상이면 성인, 14~20세는 청소년, 14세 미만은 어린이로 구분
		
		int age = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요: ");
		age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("성인입니다");
		} else if (age > 13) {
			System.out.println("청소년입니다");
		} else {
			System.out.println("어린이입니다");
		}
		
		System.out.println("=============================");
		// Q2. 학점을 계산(90이상은 A, 80이상은 B, 70이상은 C, 그 미만은 F
		int score = 0;
		System.out.print("학점을 입력하세요: ");
		score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A학점입니다");
		} else if (score >= 80) {
			System.out.println("B학점입니다");
		} else if (score >= 70) {
			System.out.println("C학점입니다");
		} else {
			System.out.println("F학점입니다");
		}
		
		
		System.out.println("=============================");
		
		
		// Q3. 비밀번호를 정해놓고 사용자가 비밀번호를 입력해서 맞추면 '비밀번호가 맞습니다', 틀리면 '비밀번호가 다릅니다'
		
		int pw = 135790;
		
		int pw2 = 0;
		
		System.out.print("비밀번호를 입력하세요: ");
		pw2 = sc.nextInt();
		
		if(pw2 == pw) {
			System.out.println("비밀번호가 맞습니다");
		} else if(pw2 != pw) {
			System.out.println("비밀번호가 다릅니다");
		}
		
		
		// Q4. 윤년 구하기
		
		int year = 0;
		
		System.out.print("년도를 입력하세요: ");
		year = sc.nextInt();
		
		if ((year % 4) == 0 &&  (year % 100) != 0 || (year % 400) == 0) {
			System.out.println("윤년입니다");
		} else {
			System.out.println("윤년이 아닙니다");
		}	
	}
}
