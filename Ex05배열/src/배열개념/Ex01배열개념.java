package 배열개념;

public class Ex01배열개념 {

	public static void main(String[] args) {
		// 배열
		// :  같은 타입의 데이터 여러개를 하나의 묶음으로 달는 자료구조
		// == int 5개를 하나의 이름으로 묶을수 있다!
		
		//배열의 특징
		//1.같은 자료형만 하나로 묶을 수 있다.
		//2.각 데이터는 인덱스 번호를 부여받는다
		//	인덱스 번호는 0부터 차례로 1씩 증가한다
		//3.크기가 고정적이다.
		
		
		//배열 선언하기
		//case 1
		//1-1.정수 3개를 담는 배열 numList1
		int numList1[]=new int[3];
		//1-2. numList에 데이터 할당하기
		numList1[0] = 3;
		numList1[1] = 5;
		numList1[2] = 7;
		//numList1[3] = 7;->오류 
		
		//[case2]
		//1.배열을 만듦과 동시에 데이터를 할당
		int[]numList2 = {2,4,6};
		
		
		//배열 데이터 꺼내기
		//numList1의 0번쨰 방 데이터에 접근
		System.out.println(numList1[0]);
		
		//numList1의 0번째 방 데이터 변경
		numList1[0] = 1;
		
		//배열은 인덱스 번호가 규칙적이기 떄문에,
		//for문 사용하기 아주 적합한 구조
		
		//[예제]numList1의 모든 값 출력하기
		for(int i =0; i<numList1.length; i++) {
			System.out.println(numList1[i]);
		}
		

	}

}
