package loop;

import java.util.Scanner;

public class While3 {
	public static void main(String[] args) {
		// while문의 플래그를 활용하여
		// 1~10의 합계를 구해보자
		
		int i = 1;
		int sum = 0;
		int num = 0;
		
		while(i < 11) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
		
		
		System.out.println("=======================================");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		num = sc.nextInt();
		
		while(i <=num) {
			sum += i;
			i++;
		}
		System.out.println("1부터"+num+"까지의 합계:" + sum);
		
	}
}
