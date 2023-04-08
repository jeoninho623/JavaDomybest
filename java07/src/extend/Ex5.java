package extend;

public class Ex5 {
	public static void main(String[] args) {
		MyStr MS1 = new MyStr("hello");
		MS1.printStr();
		
		Ms_1 MS2 = new Ms_1("hello");
		MS2.printStr();
	}
}
class MyStr{
	// 멤버변수
	protected String str;
	
	//생성자
	public MyStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	public void printStr() {
		System.out.println(str);
	}
}


// MyStr 클래스를 상속받고 출력이 좀 더 꾸며진채로 출력될 수 있게 변경
class Ms_1 extends MyStr{

	

	public Ms_1(String str) {
		super(str);
		
	}

	public void printStr() {
		
		System.out.println("^^"+str+"^^");
	}
	
}