package 이차원배열실습;

public class Ex01기초예제 {

	public static void main(String[] args) {

		// 1.이차원 배열 생성
		int[][] array2 = { { 1, 2, 3, 4 }, // 0행
				{ 5, 6, 7, 8 }, // 1행
				{ 9, 10, 11, 12 }// 2행
		};

		// for문 써서 1,2,3,4 출력
		// array2/length : arry2 행의 갯수
		// array[0].length : array2의 0번 행이 가지고 있는 데이터의 갯수

//		for (int i = 0; i < array2[0].length; i++) {
//			System.out.println(array2[0][i]);
//		}
//		System.out.println("=====");
//		for (int i = 0; i < array2[1].length; i++) {
//			System.out.println(array2[1][i]);
//		}
//		System.out.println("=====");
//		for (int i = 0; i < array2[2].length; i++) {
//			System.out.println(array2[2][i]);
//		}

		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j]+" ");
			}
		System.out.println();
		}

		for(int[] i: array2) {
			for(int j : i)
				System.out.println(j);
		}
		
	}
}