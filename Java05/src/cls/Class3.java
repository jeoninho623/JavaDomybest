package cls;

public class Class3 {
	public static void main(String[] args) {
		Car 아빠차 = new Car(); 
		Car 엄마차 = new Car();
		
		아빠차.차주인 = "아빠";
		아빠차.차종 = "G90";
		아빠차.차색상 = "검정";
		
		
		아빠차.Carinfo();
		엄마차.Carinfo();				// 값을 안 담고 사용하면 버그 발생
	}
}

// class
// 데이터 : 차주인, 차종, 차색상
// 기능 : 차정보(주인이 누구인지, 차종은 무엇인지, 차색상은 무엇인지)

class Car{
	String 차주인;
	String 차종;
	String 차색상;
	
	
	void Carinfo() {
		System.out.println("차정보: "+차주인+","+차종+","+차색상);
	}
}