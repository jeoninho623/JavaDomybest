package review;

public abstract class Adapter1 implements Interface1{
	// 추상클래스 : 인터페이스와 클래스의 반반 (인터페이스처럼 사용해도 되고 클래스처럼 사용해도 됨ㅅㄱㄹ~)
	// 어댑터(인터페이스를 상속받아서 일부만 구현해서 다른 클래스에 상속을 해줄때 많이 쓴다네요)
	
	public void must1() {
		System.out.println("어댑터에서 미리 구현해서 제공해줄 메서드");
	}
	
	// must2는 구현을 하지 않았기 때문에
	// 상속받는 곳에서 구현해줘야함
	
	// 인터페이스처럼 추상메서드 제공 가능(메서드 선언만)
	public abstract void must3();
	
	public String have() {
		return "hello";
	}
	
	
}
