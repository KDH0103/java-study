package Ex10추상메소드;

public class TempEmployee extends Employee {

	
	public TempEmployee(String empno, String name, int pay) {
		super(empno,name,pay);
	}
	
	
	public int getMoneyPay() {
		return pay/12;
	}
	

}
