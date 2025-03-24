package Ex10추상메소드;

public class Main {

	public static void main(String[] args) {
		
		RegularEmployee r = new RegularEmployee("SMHRD001", "홍길동", 4000, 0);
		System.out.println(r.print());
		
		TempEmployee t = new TempEmployee("SMHRD002","박ㅇ수",3000);
		System.out.println(t.print());
		
		
		PartTimeEmployee p = new PartTimeEmployee ("SMHRD003","임성훈",10,0);
		System.out.println(p.print());
		
	
		
		
	}

}
