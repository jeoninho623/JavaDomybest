package cls;

public class Method4 {
	public static void main(String[] args) {
		MyClass7 inho = new MyClass7();
		int plus = inho.plus(10,10);
		System.out.println(plus);
		int sub = inho.sub(30,10);
		System.out.println(sub);
		int multi = inho.multi(2,10);
		System.out.println(multi);
		double div = inho.div(10000,20);
		System.out.println(div);
		int gtr = inho.gtr(10,3);
		System.out.println(gtr);
		System.out.println("CHAT GPT 살람해요!");
	}
}

class MyClass7{
	
	// 더하기		+
	int plus(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	// 빼기		-
	int sub(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	// 곱하기		*
	int multi(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	// 나누기		/ (0으로 나누면 결과를 0으로)
	double div(int num1, int num2) {
		double result = 0.0;
		if (num2 != 0) {
            result = num1 / num2;
        } else {
            result = 0;
        }
        
        return result;
		
	}
	int gtr(int num1, int num2) {
		int gtr = 0;
		gtr = num1 - ((num1 / num2)*num2);
		return gtr;
	}
}
