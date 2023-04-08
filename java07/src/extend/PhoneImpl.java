package extend;

// Impl : 구현부
public class PhoneImpl {
	public static void main(String[] args) {
		// 인터페이스를 상속받은 클래스는 자료형을 인터페이스명으로 함 (다형성)
		Phone2G p2 = new Phone2G();
		Phone3G p3 = new Phone3G();
		PhoneLTE p4 = new PhoneLTE();
		Phone5G p5 = new Phone5G();
		
		p2.call();
		p3.internet();
		p4.speed();
		p5.bigData();
	}
}

class Phone2G implements Phone {
	// 전화 + 문자

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다.");
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("문자를 보냅니다.");
	}
}

class Phone3G implements Phone{
	// 전화 + 문자 + 인터넷

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다.");
		
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("문자를 보냅니다.");
	}
	
	public void internet() {
		System.out.println("인터넷을 합니다.");
	}
}

class PhoneLTE implements Phone{
	// 전화 + 문자 + 인터넷 + 속도

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다.");
	}
	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("문자를 보냅니다.");
	}
	
	public void internet() {
		System.out.println("인터넷을 합니다.");
	}
	public void speed() {
		System.out.println("빠름빠름빠름");
	}
}

class Phone5G implements Phone{
	// 전화 + 문자 + 인터넷 + 속도 + 빅데이터

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다.");
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("문자를 보냅니다");
	}
	public void internet() {
		System.out.println("인터넷을 합니다.");
	}
	public void speed() {
		System.out.println("무지무지무지 빠름");
	}
	public void bigData() {
		System.out.println("빅데이터를 사용합니다");
	}
}