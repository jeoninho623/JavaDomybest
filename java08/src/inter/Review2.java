package inter;

public class Review2 extends Review1 {
	// Review1의 코드가 복붙되었음(상속)

	// 상속을 했더니 클래스명에 빨간 밑줄이 간다? 명시해줘야하는 메서드가 있는것 (생성자)
	// 빨간 밑줄에 마우스 호버하고 Add 뭐시기 클릭
	public Review2(int num1, int num2, int num3, int num4) {
		super(num1, num2, num3, num4); // super(): 부모의 생성자를 사용
		super.num4 = 4; // super. : 부모의 변수 또는 메서드를 사용
		// super. : 부모의 변수 또는 메서드를 사용
		// this. : 나(클래스)의 변수 또는 메서드 사
	}

	// 상속(복붙)을 하는 이유는 '기존 클래스를 유지한채로 수정/추가하기 위해서'
	// 수정(오버라이딩)
	public void printNum() {
		// super.printNum(); // super.printNum(): 부모의 printNum을 사용(코드 실행)
		System.out.println("결과:" + (num2 + num3));
	}

	// 추가(오버로딩)
	private String str = "자식 클래스";

	public void printStr() {
		System.out.println(str);
	}

	public static void main(String[] args) {
		// static메서드에서 일반 클래스를 사용하기 위해선 '객체화'를 해줘야함
		Review2 review2 = new Review2(0, 1, 2, 3);
		review2.printNum();
		System.out.println(review2.num4);
	}
}
