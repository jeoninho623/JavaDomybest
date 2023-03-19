package operator;

public class Oper1 {
	public static void main(String[] args) {
		// 프로그래밍은 기본적으로 위에서 아래로 왼쪽에서 오른쪽으로 진행
		// 
		int 숫자1 = 3;			// 대입연산자 = : 오른쪽에 있는 값을 왼쪽에 있는 공간에 담아라
		int 숫자2 = 2;
		System.out.println(숫자1 - 숫자2 * 숫자2);
		System.out.println((숫자1 - 숫자2) * 숫자2);
		
		System.out.println(8/4/2);
		System.out.println(8/(4/2));
		
		// 자료형이 int (소수점이 없는 숫자) 이기 때문에
		// 나누기를 한 다음 소수점은 '삭제'
		
		System.out.println(3/2);			// 1.5 : X ,1 : O
		
		System.out.println(3/2.0);			// 소수점이 있는 숫자로 계산해야 소수점 있는 숫자로 나옴
		
	}
}
