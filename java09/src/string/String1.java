package string;

public class String1 {
	public static void main(String[] args) {
		// String 문자열 (자바에서 제공해주는 클래스)
		String str = "hello world!";
		
		// 두 문자열이 같은지 비교하는 메서드 equals
		boolean result = str.equals("hello world");
		System.out.println(result);
		
		if(str.equals("hello world")) {
			System.out.println("같네요");
		} else {
			System.out.println("다릅니다");
		}
		
		// 2. 해당 문자열을 포함하는지 검사 contains
		if(str.contains("hell")) {
			System.out.println("포함하네요");		// str안에 hell 문자열이 있는지 검사
		}
		else {
			System.out.println("그런거 없다네요");
		}
		
		// 3. 교체 replace
		String result2 = str.replace("hello","hi");
		System.out.println(result2);
		
		// 4. 글자 수 알려주기 length()
		System.out.println(str.length());
		
		// "hi" >> ['h','i',0]
		// 5. 글자의 시작 위치를 알려주기 indexOf()
		int result3 = str.indexOf("world");
		System.out.println(result3);
		
		// 6. 위치를 알려주면 해당하는 글자로 알려주기 charAt()
		char result4 = str.charAt(1);
		System.out.println(result4);
		
		// 7. 잘라내기(추출하기) substring
		result2 = str.substring(1, 5);
		System.out.println(result2);
		
		// 8. 합치기 + 
		str = str + "@@";
		System.out.println(str);
		
		// quiz. 길동이만 추출해서 출력
		String src = "홍길동";
		String res = src.substring(1,3);
		System.out.println(res);
		
		// quiz2. src2 변수에서 홍길동을 장보고로 바꿔서 출력
		String src2 = "안녕하세요 저는 홍길동, 올해 무려 25살입니다";
	
		String res2 = src2.replace("홍길동", "장보고");
		System.out.println(res2);
		
		
		
	}
}





























