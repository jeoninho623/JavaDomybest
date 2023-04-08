package extend;

public class Ex1 {
	public static void main(String[] args) {
		Human 홍씨 = new Human("홍길동",19, false);
		홍씨.말하기();
		홍씨.밥먹기();
		
		HumanEx 박씨 = new HumanEx("박첨지",18, false);
		박씨.말하기();
		박씨.밥먹기();
		
		HumanDeco 신씨 = new HumanDeco("신짱구",5, false);
		신씨.나이정보();
		// 변수다! 원본에 버그가 발생해서 수정해야하면?
		// 1번 수정작업 필요 ==> 3번을 수정해야함 씨야발
		// 실수를 할 확률이 높아짐 ㅋㅋㄹㅃㅃ^^
		
		// ==> 문제발생원인? "복사 붙여넣기를 했기때문에 발생함 복돌땜쉬"
		// ==> '사람이' 복붙했기 때문에
		// ==> 컴퓨터가 알아서 복붙하게하자 (상.속.)
	}
}
// 사람 (Human) 클래스
class Human {
	// 이름, 나이
	
	private String name;
	private int age;
	private boolean gender;
	
	// 생성자로 정보채워넣기
	Human(String name, int age, boolean gender){
		System.out.println("생성! 따란!");
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// 말하기, 걷기, 밥먹기
	public void 말하기() {
		System.out.println(name+"(이)가 말합니다."+gender);
	}
	public void 걷기() {
		System.out.println(name+"(이)가 걷습니다."+gender);
	}
	public void 밥먹기() {
		System.out.println(name+"(이)가 밥을 먹습니다"+gender);
	}
}
// 이름옆에 나이 추가하기
class HumanEx {
	// 이름, 나이
	
	private String name;
	private int age;
	private boolean gender;
	
	// 생성자로 정보채워넣기
	HumanEx (String name, int age, boolean gender){
		System.out.println("생성! 따란!");
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// 말하기, 걷기, 밥먹기
	public void 말하기() {
		System.out.println(name+"("+age+")(이)가 말합니다."+gender);
	}
	public void 걷기() {
		System.out.println(name+"("+age+")(이)가 걷습니다."+gender);
	}
	public void 밥먹기() {
		System.out.println(name+"("+age+")(이)가 밥을 먹습니다"+gender);
	}
}

// Human 클래스에서 이름 옆에 ==을 붙인 클래스
class HumanDeco {
	// 이름, 나이
	private String name;
	private int age;
	private boolean gender;			// 성별 (남: false, 여: true)
	
	// 생성자로 정보채워넣기
	HumanDeco (String name, int age, boolean gender){
		System.out.println("생성! 따란!");
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// 말하기, 걷기, 밥먹기
	public void 말하기() {
		System.out.println("=="+name+"("+age+")(이)가 말합니다."+gender);
	}
	public void 걷기() {
		System.out.println("=="+name+"("+age+")(이)가 걷습니다."+gender);
	}
	public void 밥먹기() {
		System.out.println("=="+name+"("+age+")(이)가 밥을 먹습니다"+gender);
	}
	public void 나이정보() {
		System.out.println("=="+name+"의 나이는 "+age+" 살입니다"+gender);
	}
}
