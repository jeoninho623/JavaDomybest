package condition;

import java.util.Scanner;

public class If3 {
	public static void main(String[] args) {
		// Q. 사용자에게 정수를 입력받고 정수가 90점 이상이면 우등생입니다. 를 출력하는 프로그램 만들기^^
		int score = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		score = scan.nextInt();
		
		if (score >= 90) {
			System.out.println("우등생입니다!");
		}
		else if(score < 90) {
			System.out.println("안타깝네요ㅜㅜ");
		}
	}
}
