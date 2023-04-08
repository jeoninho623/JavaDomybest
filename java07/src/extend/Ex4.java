package extend;

public class Ex4 {
	public static void main(String[] args) {

		스타벅스_부평점 cafe2 = new 스타벅스_부평점("부평점", 125);
		cafe2.printMenu();
		
		스타벅스_강남점 cafe3 = new 스타벅스_강남점("강남점",321);
		cafe3.printMenu();
	}
}

class 스타벅스 {
	protected String 지점명;
	protected String 메뉴[] = new String[3];
	protected int 매출;

	public 스타벅스(String 지점명, int 매출) {
		this.지점명 = 지점명;
		this.매출 = 매출;
		setMenu();
	}

	public void setMenu() {
		메뉴[0] = "아.아";
		메뉴[1] = "차가운 핫초코";
		메뉴[2] = "따듯한 아이스티";
	}

	public void printMenu() {
		System.out.print(지점명 + "의 메뉴판 : ");
		for (int i = 0; i < 메뉴.length; i++) {
			System.out.print(메뉴[i] + " ");
		}
		System.out.println();
		System.out.println(지점명 + "의 매출 : " + 매출);
	}
}

// 스타벅스_부평점
class 스타벅스_부평점 extends 스타벅스 {

	public 스타벅스_부평점(String 지점명, int 매출) {
		super(지점명, 매출);
		
	}

	public void setMenu() {
		메뉴[0] = "카페라떼";
		메뉴[1] = "콜드브루 아메리카노";
		메뉴[2] = "디카페인 아메리카노";
	}
}

// 스타벅스_강남점
class 스타벅스_강남점 extends 스타벅스 {

	public 스타벅스_강남점(String 지점명, int 매출) {
		super(지점명, 매출);
	}
	
	public void setMenu() {
		메뉴[0] = "카푸치노";
		메뉴[1] = "아인슈페너";
		메뉴[2] = "당근쥬스";
	}
}
