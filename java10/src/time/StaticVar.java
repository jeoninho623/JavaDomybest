package time;

public class StaticVar {
	// 이렇게 하시면 안됩니다. 싱글턴패턴으로 바꾸셈. (단, 성능 개 구데기)
	static String str1 = "안녕하세요";
	static String str2 = "반갑습니다";
	static int num1 = 314;
	static int nums[] = new int[100];			// 성능 에바임;; 답이 없어요 
	
	public static void main(String[] args) {
		Test.print();
		
		Singleton singleton = Singleton.getInstance();
		singleton.setStr("안녕하세요 싱글턴입니다.");
		System.out.println(singleton.Getstr());
	}
}

class Test{
	public static void print() {
		System.out.println(StaticVar.str1);
		StaticVar.nums[0] = 0;
		StaticVar.nums[1] = 1;
		StaticVar.nums[2] = 2;
		
		System.out.println(StaticVar.num1);
		
	}
}
