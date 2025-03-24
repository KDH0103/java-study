package 포켓몬게임;

import java.util.Scanner;

public class PokemonMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 포켓몬 두마리 생성(Pokemon 클래스를 기반으로 객체 2개 생성)
		// 피카츄,전기,백만보르,100,10
		// 잠만보,노멀,누르기,200,5

		Pokemon pika = new Pokemon("피카츄", "전기", "백만볼트", 100, 10);
		Pokemon jamman = new Pokemon("잠만보", "노멀", "누르기", 200, 5);

		while (true) {
			System.out.println("=====포켓몬을 선택하세요====");
			System.out.print("[1]피카츄 [2]잠만보 >>");
			int choic = sc.nextInt();

			if (choic == 1) {
				System.out.println("====공격을 선택하세요 ====");
				System.out.print("[1]일반 공격 [2]스킬 공격>>");
				int choiceAtk = sc.nextInt();
				// 사용자가 피카츄 선택
				// 피카츄가 잠만보를 공격
				if (choiceAtk == 1) {
					// 일반공격을 선택했다면
					// 잠만보의 hp를 피카츄의 atk만큼 감소시키기
					jamman.setHp(jamman.getHp() - pika.getAtk());

				} else {
					// 2)스킬공격을 선택했다면
					// 잠만보의 hp 피카츄의 atk*1.5만큼 감소시키기
					jamman.setHp(jamman.getHp() - (int) (1.5 * pika.getAtk()));

				}

				// 3) 두마리 포켓몬의 hp 출력하기
	

			} else if (choic == 2) {
				System.out.println("====공격을 선택하세요 ====");
				System.out.print("[1]일반 공격 [2]스킬 공격>>");
				int choiceAtk = sc.nextInt();
				
				if (choiceAtk == 1) {
					// 일반공격을 선택했다면
					// 잠만보의 hp를 피카츄의 atk만큼 감소시키기
					pika.setHp(pika.getHp() - jamman.getAtk());
					
				} else {
					// 2)스킬공격을 선택했다면
					// 잠만보의 hp 피카츄의 atk*1.5만큼 감소시키기
					pika.setHp(pika.getHp() - (int) (1.5 * jamman.getAtk()));
					
				}

				// 일반공격을 선택했다면
				// 잠만보의 hp를 피카츄의 atk만큼 감소시키기
		 		

			}
				

			// 3) 두마리 포켓몬의 hp 출력하기
			System.out.println("==== 남은 hp ====");
			System.out.println("피카츄의 남은 hp:" + pika.getHp());
			System.out.println("잠만보의 남은 hp:" + jamman.getHp());

			if(pika.getHp()<=0) {
				System.out.println("피카츄 승");
				break;
			}else if(jamman.getHp()<=0) {
				System.out.println("잠만보 승");
				break;
			}

		} 
		// 포켓몬 선택 공격 선택하는것까지 계속 반복!
		// 4두마리의 포켓문 중 한마리라도 hp가 0보다 작거나 같았을때 프로그램 종료
		// --->break 사용
		// 5.승자가 누구인지 출력
	}
}
