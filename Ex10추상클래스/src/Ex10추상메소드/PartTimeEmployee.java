package Ex10추상메소드;

public class PartTimeEmployee extends Employee {
	

	private int workDay;
	
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno,name,pay);

		this.workDay = workDay;
	}
	
	
	public int getMoneyPay() {
		return pay*workDay;
	}


}
