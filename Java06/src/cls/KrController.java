package cls;

public class KrController {
	public static void main(String[] args) {
		KrModel inhom = new KrModel();
		KrModel inhom2 = new KrModel();
		inhom.setNum(111);
		inhom.setStr("ㅎㅇ");
		inhom2.setNum(222);
		inhom2.setStr("ㅂㄱ");
		
		KrService inhos = new KrService();
		
		KrView inhov = new KrView();
		KrView inhov2 = new KrView();
		inhos.decoEquals(inhom);
		inhos.decoPlus(inhom2);
		
		inhov.printNum(inhom);
		inhov.printStr(inhom);
		inhov2.printNum(inhom2);
		inhov2.printStr(inhom2);
		
		
		
	}
}

// krModel 클래스(num, str)
class KrModel{
	
	public int num;
	String str;
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}
}
// KrView 클래스 (출력용)
class KrView{
	void printNum(KrModel inho) {
		System.out.println(inho.getNum());
	}
	void printStr(KrModel inho) {
		System.out.println(inho.getStr());
	}
}	
// KrService 클래스 (자바기능)	
class KrService{
	void decoEquals(KrModel inho) {
		// 양 옆에 == 표시
		inho.setStr("=="+inho.getStr()+"==");						// 문자열을 가져온 다음 ==을 붙여서 저장
	}
	void decoPlus(KrModel inho) {					
		// 양 옆에 + 표시
		inho.setStr("+"+inho.getStr()+"+");							// 문자열을 가져온 다음 +를 붙여서 저장
		inho.str = "+" + inho.str + "+";
	}
}
	
	
	
	
	
