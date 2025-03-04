package 삼항연산자;

public class Ex01삼항연산자개념 {

	public static void main(String[] args) {
		//삼항연산자
		//조건문 ? A : B
		//조건문이 참이라면 A, 거짓이라면 B
		
		int num1 =4;
		int num2 =7;
		
		String result = num1<num2 ? "num2가 더 크다 " : "num1이 더 크다";
		
		System.out.println(result);

	}

}
