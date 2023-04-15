package review;

public interface Interface1 {
	// 상수 + 메서드껍데기
//	void must();		// 선언만
	void must2();
	abstract void must4();		// 사실은 요 꼬라지를 하고있음
	
	int num = 0;			// 상수 (변경 불가능)
	final static  int num2 = 2; 		// 얘 또한 이런 꼴임
}