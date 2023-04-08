package extend;

public class Ex3 {
	public static void main(String[] args) {
		MyString ms1 = new MyString("hello");
		ms1.Myprint2();

		MyStringEx ms2 = new MyStringEx("Bye", "Goodbye");
		ms2.Myprint2();
	}
}

class MyString {
	private String str1;
	String str2;
	protected String str3;
	public String str4;

	MyString(String str) {
		System.out.println("MyString 객체화");
		this.str1 = str;
		this.str2 = str;
		this.str3 = str;
		this.str4 = str;
	}

	public void Myprint() {
		System.out.println(str1);
	}

	public void Myprint2() {
		System.out.println(str1 + str2 + str3 + str4);
	}

	public void setStr(String str) {
		this.str1 = str;
	}

	public String getStr() {
		return str1;
	}

}

// extends : 복붙
class MyStringEx extends MyString {

	MyStringEx(String a_str1, String a_str2) {
		super(a_str1); // ()가 있는건 '함수'라는 뜻
		// super() : 부모의 생성자 (부모 생성자의 메서드를 사용)
		// super. : 부모의
		// str1 = ""; // private이라 모름 ㅋㅋ ㅄ
		setStr(a_str2);
		str2 = "ㅇ"; // default
		str3 = "ㅅㄱ"; // protected
		str4 = "ㅂ2"; // public

	}

}
