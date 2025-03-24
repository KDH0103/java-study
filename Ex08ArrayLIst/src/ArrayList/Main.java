package ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// ArrayList
		//: 크기가 가변적인 배열과 같은 형태를 가진 클래스
		
		//1.ArrayList생성
		//:래퍼런스 타입의 데이터만 저장할 수 있다.
		//ex) String, Pokemon,Student
		ArrayList<String> list = new ArrayList<String>();
		
		//2.데이터 추가하기
		list.add("이도연");
		list.add("주미리");
		list.add("신재영");
		
		//3.데이터 가져오기
		System.out.println(list.get(1));
		
		//4.데이터 특정 위치에 추가하기
		list.add(2, "임승환");
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		//5. 데이터 삭제하기
		list.remove(2);
		System.out.println(list.get(2));
		
		//6.데이터 크기 알아보기
		System.out.println("list의 크기 : "+list.size());
		
		//7.데이터 전체 삭제하기
		list.clear();
		System.out.println("clear 사용 후 list의 크기 :" + list.size());
		
	}

}
