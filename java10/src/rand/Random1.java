package rand;

import java.util.Random;
import java.util.Scanner;

import time.GetInstance;

public class Random1 {
	public static void main(String[] args) {
		// 자바에서 랜덤을 사용하는 법
		// Math클래스 또는 Random클래스 사용
		MyRandom mr = new MyRandom();
		mr.go1();
		mr.go2();
		mr.go3();
		
		Lotto lo = Lotto.getInstance();
		System.out.println(lo.siu());
		
	}
}

class MyRandom{
	// nextInt() : 0~0.9999999까지 랜덤 후 int로 형변환 (단 ()가 비어있을때^^)
	public void go1() {
		// 0~9 랜덤
		Random random = new Random();
		int result = random.nextInt(10);			// 0 ~ 9까지 랜덤 (0*10 ~ 0.9999*10)
		System.out.println(result);
	}
	
	public void go2() {
		// 100 ~ 105 까지 랜덤
		Random random = new Random();
		int result = random.nextInt(6) + 100;				// (0 ~ 0.99999) +100
		System.out.println(result);
	}
	
	public void go3() {
		Random random = new Random();
		int result = random.nextInt(10) + 1;					
		System.out.println(result);
	}
	
	// Math 클래스를 사용해서 랜덤
	public void go4() {
		int result = (int)(Math.random() * 10) +1;		// 1 ~ 10
		System.out.println(result);
	}
}


// 싱글턴패턴 클래스로 생성해서 두 수를 입력받아 그 사이에서 랜덤을 돌려 리턴해주는 메서드
class Lotto{
	// 생성자를 막고
	private Lotto() {}
	
	// 객체
	private static Lotto instance;
	
	// 객체화를 진행할 메서드
	public static Lotto getInstance() {
		if(instance == null) {
			instance = new Lotto();
		}
		return instance;
	}
	
	// 멤버변수, 메서드
	public int siu() {
		// 숫자 2개 입력받고(Scanner)
		// 첫번째 숫자가 더 크면 교체하고(swap)
		// 랜덤돌리기(Random)
		
		// 숫자 2개 입력받고
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요>>");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요>>");
		int num2 = sc.nextInt();
		int temp = 0;
		
		// 첫번째 숫자가 더 크면 교체하고
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		// 랜덤돌리기
		Random random = new Random();
		int result = random.nextInt(num2-num1+1)+num1;	// 100 ~ 105
		
		// 정리작업
		sc.close();
		return result;
	}
}


























