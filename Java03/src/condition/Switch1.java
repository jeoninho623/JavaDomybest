package condition;

import java.util.Scanner;

public class Switch1 {
	public static void main(String[] args) {
		// 제어문 : if, switch, while, for, break, continue
		// 조건문 : if, switch
		// if가 기본 조건문, switch는 같은 경우만 비교 (가독성)

		int num = 2;

		// if문
		if (num == 0) {
			System.out.println("num은 0이다");
		} else if (num == 1) {
			System.out.println("num은 1이다");
		} else if (num == 2) {
			System.out.println("num은 2다");
		} else {
			System.out.println("그밖에");
		}
		// 이렇게 같은 것을 찾는 조건문은 switch로 변경 할 수 있다
		// switch문
		switch (num) {
		case 0:
			System.out.println("0이다");
			break;
		case 1:
			System.out.println("1이다");
			break;
		case 2:
			System.out.println("2다");
			break;
		default:
			System.out.println("그밖에");
		}
		
		// switch ~ case: ~ break:
		// if ~ else if ~ else
		
		// 퀴즈 : 사용자 입력받기
		/*
		  1 : 안녕하세요
		  2 : 반가워요
		  3 : 잘있어요
		  4 : 다시만나요
		  1,2,3,4가 아니면 : 잘못입력하셨어용
		 */
		int num1 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		num1 = sc.nextInt();
		
		switch (num1) {
		case 1:
			System.out.println("안녕하세요");
			break;
		case 2:
			System.out.println("반가워요");
			break;
		case 3:
			System.out.println("잘있어요");
			break;
		case 4:
			System.out.println("다시만나요");
			break;
		default:
			System.out.println("잘못입력하셨어용");
			break;
		}
		sc.close();
		
	}
}
