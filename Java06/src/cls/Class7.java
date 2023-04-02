package cls;
	
public class Class7 {
	public static void main(String[] args) {
		// 객체화
		Human 홍길동 = new Human();
		Human 유관순 = new Human();
		
		홍길동.setName("홍길동");
		홍길동.setGen("남성");
		홍길동.setAge(30);
		
		유관순.setName("유관순");
		유관순.setGen("여성");
		유관순.setAge(19);
		
		HumanView hv = new HumanView();
		hv.printInfo(홍길동);
		hv.printInfo(유관순);
	}
}

// 멤버변수 private
// 메서드 public
class Human{
	// 데이터 : name, gender, age
	private String name;
	private String gen;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getGen() {
		return gen;
	}
	public int getAge() {
		return age;
	}
}
class HumanView{
	void printInfo(Human hv) {
		System.out.println("이름: "+hv.getName()+" "+"성별: "+hv.getGen()+" "+"나이: "+hv.getAge());
	}
}