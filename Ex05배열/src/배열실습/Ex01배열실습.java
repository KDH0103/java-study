package 배열실습;

public class Ex01배열실습 {

	public static void main(String[] args) {
		// [실습] 가장 큰 수 찾기

		// 1. 정수 데이터 5개를 저장할 수 있는 배열 array만들기
		// --->정수데이터는 6,3,8,4,2
		// 2.배열 안의 데이터 중 가장 큰 값을 출력

		int max = 0;
		int[] array = { 6, 3, 8, 4, 2 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}

		}
		System.out.println("가장 큰 값은 "+ max);
	}

}