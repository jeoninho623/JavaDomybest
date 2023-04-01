package review;

import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {
		String str = "";
		int num = 0;
		double dnum = 0.0;
		dnum = (double)num;
		str = Integer.toString(num);
		num = Integer.parseInt(str);
		// 복습퀴즈
		// 사용자에게 정수를 입력받고
		// 천의 자리로 ,를 넣어보자

		/*
		 * 100 ==> 100
		 * 1000 ==> 1,000
		 * 1000000 ==> 1,000,000
		 * 10000 ==> 10,000
		 * 10억까지만
		 */
		int money = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력해주세요: ");
		money = sc.nextInt();
		int thousand = 0;
		int tho = 0;
	
		
		if(money <= 9999) {
			str = Integer.toString(money);
			thousand = money/1000;
			tho = money % 1000;
			System.out.println(thousand + "," + tho );
			
		} else {
			System.out.println(money);
		}
		
		sc.close();
	}
}
