package inter;

public interface Review3 {
	// 상속용 클래스
	// 인터페이스 : 상수 또는 메서드의 선언부[()까지만 사용]만 올 수 있음
	final static String str = "Review3 Interface"; // 상수 : Final 한번 정하면 못 바꿈
	String str2 = "final static이 생략되어 있음 ㅅㄱㄹ"; // 자료형 앞에 final static이 자동 생략

	public void test1(); // {}없이 선언까지만
	public void test2(); // 상속받은 곳에서 반드시 오버라이딩으로 {}를 구현해야함
}
