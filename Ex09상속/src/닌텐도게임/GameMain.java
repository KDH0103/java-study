package 닌텐도게임;

public class GameMain {
//닌텐도 게임기(시랳ㅇ할 수 있는 공간)
	public static void main(String[] args) {
		

		
		Mario m= new Mario();
		
		
		on(m);
		
		Zelda z = new Zelda();
		
		on(z); 
		
		PokemonGo p = new PokemonGo();
		on(p);

		
			
		}
		
	private static void on(Mario m) {
		m.gameStart();
		// TODO Auto-generated method stub
	}
	/* 메소드 오버로딩 기법으로 풀어내는 방법
	private static void on(PokemonGo p) {
		p.gameStart();
		// TODO Auto-generated method stub
		
	}
	private static void on(Zelda z) {
		z.gameStart();
		// TODO Auto-generated method stub
		
	}
	*/



}
