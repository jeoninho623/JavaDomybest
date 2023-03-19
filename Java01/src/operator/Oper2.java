package operator;

public class Oper2 {
	public static void main(String[] args) {
		int 국어 = 49;
		int 영어 = 40;
		int 수학 = 60;
		
		// 합계와 평균을 구해보자
		int sum = 국어 + 영어 + 수학;
		int avg = sum/3;
		double avg2 = sum / 3.0;
		
		System.out.println("합계 : " + sum + "점");
		System.out.println("평균 : " + avg + "점");
		System.out.println("평균 : " + avg2 + "점");
	}
}
