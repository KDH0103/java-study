package 상속기초;

public class Child extends Parent {
	
	//새로운 클래스, 자식클래스,서브클래스
	//한식당 2호점
	//extends ---->연장하다,확장하다 의미!
	//: class를 선언하는 구간에 적는다!
	
	//1. 불닭 메뉴를 만든다
	
	/**
	 * 불닭 메뉴를 만드는 메소드
	 * @author 이도연
	 * @since 25.03.13
	 * @return void
	 * @param 매개변수 없음
	 */
	public void makeBul() {
		System.out.println("맛있는 불닭을 만든다~~~~");
	}
	//2.부모님 가게의 비빔밥 메뉴를 변경
	//annotation(주석)
	//-->자동완성된 메소드 위에 마우스를 올렸을때 포스트잇 모양에 표시해주는 역할!
	@Override
	public void makeBibim() {
		System.out.println("아주아주 맛있는 비빔밥을 만든다~~~~");
	}
	
	//메소드 오버라이딩(method overriding)
	// :상속이 전제되어있어야 한다!
	// :부모 클래스가 가지고 있는 메소드의 틀
	//  그대로 가지고 와서 {} 안쪽의 로직만 ****재정의**** 하는 기법
	
	//오버라이딩 -재정의
	//오버로딩-중복정의
}
