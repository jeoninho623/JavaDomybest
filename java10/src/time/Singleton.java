package time;

public class Singleton {
	// 디자인패턴을 싱글턴패턴으로 해서 클래스를 구성(디자인)
	private Singleton() {}
	
	private static Singleton instance;		// 객체를 저장할 멤버변수
	
	// 객체 멤버변수를 반환해줄 static 메서드 : getInstance()
	public static Singleton getInstance() {		// 얘를 통해 객체화
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	
	
	
	// 멤버변수와 메서드
	private String str;
	public String Getstr() {
		return str;
	}
	public void setStr(String Str) {
		this.str = Str;
	}
}

