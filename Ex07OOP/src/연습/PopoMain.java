package 연습;

import java.util.Scanner;

import 포켓몬게임.Pokemon;

public class PopoMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Popo pika = new Popo("피카츄", "전기", "백만볼트", 100, 10);
		Popo jamman = new Popo("잠만보", "노멀", "누르기", 200, 5);

		while (true) {
			System.out.println("======포켓몬을 선택하세요=====");
			System.out.println("[1]피카츄 [2]잠만보 >>");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("======공격을 선택하세요=====");
				System.out.println("[1]일반공격 [2]스킬공격 >>");
				int choiceatk = sc.nextInt();

				if (choiceatk == 1) {
					jamman.setHp(jamman.getHp() - pika.getAtk());
				} else{
					jamman.setHp((int) (jamman.getHp() - 1.5 * pika.getAtk()));
				}
				
				
			} else if (choice == 2) {
				System.out.println("======공격을 선택하세요=====");
				System.out.println("[1]일반공격 [2]스킬공격 >>");
				int choiceatk = sc.nextInt();

				if (choiceatk == 1) {
					pika.setHp(pika.getHp() - jamman.getAtk());
				} else{
					pika.setHp((int) (pika.getHp() - 1.5 * jamman.getAtk()));
				}
		
			}
			System.out.println("======남은 hp=====");
			System.out.println("피카츄" + pika.getHp());
			System.out.println("잠만보" + jamman.getHp());
			
			if (pika.getHp() <= 0) {
				System.out.println("잠만보 승");
				break;
			} else if (jamman.getHp() <= 0) {
				System.out.println("피카츄 승");
				break;
		
			}	
		}

	}

}
