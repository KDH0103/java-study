package 클랙스객체기초;

public class BankMain {

	public static void main(String[] args) {
		
		Bank dhBank = new Bank();
		
		//dhBank.money = 1000; 오류!
		dhBank.inMoney(100);//입금
		dhBank.outMoney(300);//출급
		
		
		//System.out.println(dhBank.money);오류!
		
		System.out.println("잔액은"+dhBank.showMoney());
		
	}

}
