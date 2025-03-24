package 클랙스객체기초;

public class PersonMain {

	public static void main(String[] args) {
		// 설계도를(클래스) 기반으로 객체를 만들어보자~
		
		//객체 생성
		//설계도명 객체명 = new 설계도명();
		//**객체 생성할때 붙는 ()는 생성자 메소드
		Person miri = new Person();
		
		//객체에 데이터 할당(age, name) - 속성
		miri.age =20;
		miri.name = "미리";
		
		//객체가 가진 데이터 출력해보기
		System.out.println(miri.name);
		
		//객체가 가진 기능 실행해보기
		miri.sleep();
		miri.introduce();
		miri.eat("치킨");
		miri.eat("콜라");
		
		System.out.println("=================");
		
		//persoen 설계도를 기반으로 새로운 사람 만들어보기!
		Person dahyeon = new Person();
		
		dahyeon.age =25;
		dahyeon.name="다현";
		
		System.out.println(dahyeon.name);
		
		dahyeon.sleep();
		dahyeon.introduce();
		dahyeon.eat("피자");
		dahyeon.eat("맥주");
		dahyeon.love("봄");
	}

}
