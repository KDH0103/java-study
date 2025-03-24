package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.Controller;
import Modle.MemberDTO;

public class Main {

	public static void main(String[] args) {
		// [VIEW]
		
		// MVC패턴
		// View : 사용자에게 시각적으로 보여줄 수 있는 역할
		// Controller : 사용자의 요청을 전처리해서, Model/View에 전달하는 다리 역할
		// Model : 데이터 처리, 데이터베이스 관련된 기능 역할
		
		// MVC 패턴의 장점 : 확장이 용이, 유지보수 편리
		
		// 실행 순서
		// 1. 사용자 요청 발생(뷰)
		// 2. 뷰 -> 컨트롤러 (요청 전달)
		// 3. 컨트롤러 -> 모델 로직실행 요청
		// 4. 모델 -> 컨트롤러 (응답데이터 전달)
		// 5. 컨트롤러 -> 뷰 (사용자에게 표시할 데이터)
		Scanner sc = new Scanner(System.in);
		
		//컨트롤러 객체
		Controller control = new Controller();

		while(true) {
		System.out.print("메뉴 선택 >> [1]회원가입 [2]전체회원조희 [3]회원정보수정 [4]회원탈퇴 [5]종료:");
		int input = sc.nextInt();
		
		if(input ==1) {
			System.out.println("===회원가입===");
			
			System.out.print("ID : ");
			String id = sc.next();
			
			System.out.print("PW : ");
			String pw = sc.next();
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			// controller에 필요한 정보를 담아서,
			// Model이 로직을 수행하게끔
			// *controller의 Con_join : view에서 입력받은 정보를 받아서 modle에 전해진ㅁ
			int result = control.Con_join(id,pw,name,age);
			
			// return된 result의 값으로 성공 여부를 확인
			if(result>0) {
				System.out.println("회원가입 성공~");
			}else {
				System.out.println("회원가입 실패ㅠㅠ");
			}
			
		}else if (input ==2) {
			System.out.println("===전체회원===");
			System.out.println("ID\t이름\t나이");
			
			ArrayList<MemberDTO> result = control.Con_list();
			
			for(int i =0; i<result.size();i++) {
				System.out.println(result.get(i).getId() +"\t"
									+result.get(i).getName()+"\t"
									+result.get(i).getAge() );
			}
		}else if(input ==3) {
			System.out.println("===정보수정===");
			//아이디, 비번을 입력하면 그에 맞는 회원의 이름을 쉊ㅇ
			System.out.println("ID :");
			String id = sc.next();
			System.out.println("PW :");
			String pw = sc.next();
			System.out.println("변경할이름 :");
			String name = sc.next();
			int result = control.Con_update(id,pw,name);
			
			if(result > 0) {
				System.out.println("정보수정 성공");
			}else {
				System.out.println("정보수정 실패");
			}
		
		}else if(input ==4) {
			//회원탈퇴
			System.out.print("ID : ");
			String id = sc.next();
			System.out.print("PW : ");
			String pw = sc.next();
			
			//1.필요한 정보를 담아서 컨트롤러에 요청
			int result = control.Con_delete(id,pw);
			
			if(result>0) {
				System.out.println("탈퇴성공");
			}else {
				System.out.println("실패,아이디와 비밀번호를 확인해주세요");
				
			}
			//2.컨트롤러에서 정보를 전처리해서 모델로 요청
			//3,모델에서 정보를 활용해서 기능 수행
			//	->성공여부 리턴(deltet는 int 형태)
			//4.모델 -> 컨트롤러 리턴
			//5.컨트롤러 -> 뷰로 최종 리턴
			//6.뷰에서 최종 리턴값을 활요한 안내문
			//->회원가입 /정보수정/ 회원탈퇴 로직이 비슷하다~
		}else if(input==5) {
			System.out.println("프로그램 종료합니다.");
			break;
		}
		}

	}

}
