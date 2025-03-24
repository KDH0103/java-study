package 인터페이스;

import Ex10추상메소드.Employee;

public class Child extends Employee implements Temp,Temp2 {

	public Child(String empno, String name, int pay) {
		super(empno, name, pay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getMoneyPay() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void temp() {
		// TODO Auto-generated method stub
		
	}


}
