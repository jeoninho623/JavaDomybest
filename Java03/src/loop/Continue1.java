package loop;

public class Continue1 {
	public static void main(String[] args) {
		// continue : 반복문의 시작점으로 돌아감, ()로 돌아감, 밑에 코드를 무시하고 위로 올라감

		int i = 0;
		while (i < 10) {
			i++;
			if (i % 2 == 1) {
				continue;	// 실행되면 if문을 무시하고 위로 올라가는 문법(반복문 처음으로 이동)
			}
			System.out.println("while: " + i);
		}
	}
}
