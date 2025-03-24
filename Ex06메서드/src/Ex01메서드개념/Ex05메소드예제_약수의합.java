package Ex01메서드개념;

public class Ex05메소드예제_약수의합 {

	public static void main(String[] args) {
		int num = 6;
		int result = getSumofDivisors(num);
		
	
		System.out.println("\n"+num + "의 약수의 합:" + result);

	}

	public static int getSumofDivisors(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i+" ");
				sum += i;
			}
		}
		
		return sum;
	} 
	

}
