package Ex10추상메소드;

public class RegularEmployee extends Employee {
	
	

	private int bonus;

	public RegularEmployee(String empno, String name, int pay, int bonus) {
	
		super(empno,name,pay);
		this.bonus = bonus;
	}

	
	public int getMoneyPay() {
		return (pay+bonus)/12;

	}
	


	
	

	

}
