package 배열실습;

public class Ex06배열엽습_가장작은위치출력 {

	public static void main(String[] args) {
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int min = Math.abs(point[0] - point[1]);
		int first = 0;
		int second = 0;

		for (int i = 0; i < 6; i++) {

			for (int j = i + 1; j < 7; j++) {
				int dimin = Math.abs(point[i] - point[j]);
				if (dimin < min) {
					min = dimin;
					first = i;
					second = j;
				}

			}
		}
		
		System.out.println("result = "+first+" "+second);
	}

}
