package 클랙스객체기초;

public class Bank {
	//보통 변수는 디폴트 접근제한자를 썼지만
	//같은 패키지의 다른 파일에서 함부로 값을 바꾸지 못하도록
	//접근제한자를 private으로 변경
	private int money;
	
	void inMoney(int coin) {
		//매개변수만큼, money의 값을 저금
		money = money +coin;
	}
	
	void outMoney(int coin) {
		//매개변수만큼, money의 값을 차감
		money = money -coin;
	}
	
	//잔액조회 메소드
	int showMoney() {
		return money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
