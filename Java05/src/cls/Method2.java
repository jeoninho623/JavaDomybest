package cls;

public class Method2 {
	public static void main(String[] args) {
		// 객체화
		MyClass5 joke = new MyClass5();
		joke.메서드1();
		joke.메서드1();
		System.out.println("끼어들기");
		joke.메서드1();

		joke.메서드2("안녕하세여", "감사해요");
		joke.메서드2("잘있어요", "다시만나요");
		
		// 반환값이 있으면 변수로 담는 형태로 사용한다
		// 메서드3이 String으로 반환해주기 때문에
		String result3 = joke.메서드3();				// 메서드3 사용
		result3 = joke.메서드3();						// 메서드3 사용
		System.out.println(result3);				// 반갑습니다

		// 입력값O, 반환값O
		// () 안을 채워줘야하고, 반환값을 받을 변수를 만들어야한다
		// 메서드4는 int형태로 반환하고, 입력값은 실수1개
		int result4 = joke.메서드4(3.7);			// 4
		System.out.println("결과는: "+ result4);
		
		result4 = joke.메서드4(3.3); 				// 3
		System.out.println("결과는: "+result4);
		
		System.out.println("결과는: "+joke.메서드4(5.5)); 				// 변수처럼 사용가능
	}
}

class MyClass5 {
	// 메서드1 : 변환값X, 입력값X (코드저장)
	void 메서드1() {
		// 입력값이 없으면 ()를 비워놓습니다.
		// 반환값이 없으면 자료형은 void로 하고 return은 생략
		// return;

		// 오로지 코드 재사용
		int num = 1;
		System.out.println("나는 메서드" + num + "에 저장된 코드다");
	}

	// 메서드2 : 반환값X, 입력값O (코드 재활용, 일부만 변수만 경우)
	void 메서드2(String str1, String str2) {
		// 입력값이 있으면 입력받고자 하는 값의 변수들을 생성해 놓는다
		// 반환값이 없으면 자료형은 void, return은 생략
		System.out.println("소괄호로 넘어오는 값만 변경" + str1 + str2);
		System.out.println("코드 재활용" + str2);
	}

	// 메서드3 : 반환값O, 입력값X (코드 재사용, 사용 후에 전달해줄 값이 있음)
	String 메서드3() {
		// 메서드의 자료형은 return값의 자료형을 적어준다
		String result = "반갑습니다";
		System.out.println("메서드3을 사용!");

		return result; // 코드 마지막에 return 옆에 있는 값을 전달
	}

	// 메서드4 : 반환값O, 입력값O
	int 메서드4(double dnum) {
		// 입력값이 있으면 ()를 변수로 채워넣고
		// 반환값이 있으면 return을 사용하고 맨 앞의 자료형을 맞춰준다
		System.out.println("실수 자료형을 반올림합니다");
		double result = dnum-(int)dnum;			// 소수점 부분만 남아용
		if (result >= 0.5) {		
			dnum += 1.0;							// 만약에 소수점 부분이 0.5보다 컸다면 +1
		}
		return (int)dnum;							// 소수점부분 날린다
	}

}