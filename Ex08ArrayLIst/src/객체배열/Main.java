package 객체배열;

public class Main {

	public static void main(String[] args) {
		//1. 객체 배열 생성
		//자료형 [] 배열 이름 = new 자료형[칸수];
		//포켓몬 자료형을 3개 보관할 수 있는 bag 배열 생성
		
		Pokemon[]bag = new Pokemon[3];
		
		//객체 배열의 0번 인덱스에 들어있는 데이터 출력
		System.out.println("bag의 0번반 출력 :"+bag[0]);
		
		//2. 객체 배열의 0번 인덱스에 포켓몬을 넣어보자
		//이름 : 피카츄/타입 전기/ 스킬 백만볼트/ 100/10
		bag[0] =new Pokemon("피카츄", "전기","백만볼트" , 100, 10);
		System.out.println("bag의 0번방 출력 :" +bag[0]);
		System.out.println("bag의 0번방 포켓몬 이름 :" +bag[0].getName());
		
		//3.bag배열의 1,2인덱스에도 포켓몬 넣어주기
		//1.1번 인덱스
		//이름 : 잠만보/타입 : 노멀/ 스킬:누르기/hp:200/atk:5
		bag[1] =new Pokemon("잠만보", "노멀","누르기" , 200, 5);
		//2번 인덱스
		//이름 : 망냐뇽/타입 : 드래곤/ 스킬:공중날기/hp:150/atk:15
		bag[2] =new Pokemon("망냐뇽", "드래곤","공중날기" , 150, 15);
		
		//4.배열 안에 들어있는 포켓몬의 이름,타입,hp
		System.out.println("======포켓몬 정보 출력=====");
		for(int i=0; i<3; i++) {
			System.out.println(bag[i].getName()+"\t"+bag[i].getType()+"\t"+bag[i].getHp());
		}
		
		//for-each문
		//: 배열과 같이 여러개의 데이터를 저장하는 자료구조와 함께 사용
		//**동작 원리
		//배열 안에 저장되어 있는 데이터를 for문에서 순차적으로 꺼내서
		//:(콜론) 기준 왼쪽에 있는 변수에 담아주는 흐름을 가진다.
		for(Pokemon p:bag) {//(데이터 타입 변수명: 배열 이름)
			System.out.println(p.getName()+"\t"+p.getType()+"\t"+p.getHp());
		}
	
	}

}
