package loop;

public class For1 {
	public static void main(String[] args) {
		// 반복문 : while, for
		// for : while이 가독성이 떨어져서 사용
		
		int i2 = 0;
		while(i2<10) {
			// 반복할 코드
			System.out.println("While: "+ i2);
			i2++;
		}
		// while 단점 : 바깥에 플래그를 만들어줘야함, {} 안에서 플래그를 증감
		
		// 0~9까지 출력 for
		for (int i =0; i<10; i++) {
			System.out.println("for: "+i);
		}
		// for(초기값; 조건식; 증감량;){ 반복할 코드;}
		// for문의 장점: while에 비해 가독성이 좋고, 개발속도가 더 빠름
		// for문의 단점: while만큼 자유롭지않음
	}
}
