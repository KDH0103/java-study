package Controller;

import java.util.ArrayList;

import Modle.MemberDAO;
import Modle.MemberDTO;

public class Controller {
	// 1. DB연결
	// - DB연결에 대한 정보가 담겨있는 객체 소환
	
	// 1. DB로직실행

	// [Controller]
	// 사용자의 요청에 따라서 그에 맞는 DB로직을 실행
	
	//dao : db연결, 쿼리문실행 메소드
	MemberDAO dao = new MemberDAO();
	
	int result =0;//join()의 리턴데이블
	
	//list()의 리턴데이터
	ArrayList<MemberDTO> resultList = new ArrayList<>();
	
	//View에게 전달받은 데이터를 Model에 전달하면서, 기능을 수행하게끔 명령
	public int Con_join(String id, String pw, String name, int age) {
		//전달해야 하는 데이터를 하나의 묶음으로 만들어서(객체 생성)
		MemberDTO dto = new MemberDTO(id, pw, name, age);
		result = dao.join(dto);
		return result;
		
	}
	
	public ArrayList<MemberDTO> Con_list(){
		 resultList= dao.list();
		 return resultList;
	}
	
	public int Con_update(String id, String pw, String name) {
		// Con_join처럼 생성자 메소드로 데이터를 담아도 되지만,
		// Setter 메소드를 사용해서 정보를 채워보자!!
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		
		return dao.update(dto);
	}
	
	public int Con_delete(String id, String pw) {
		//전달해야 하는 데이터를 하나의 묶음으로 만들어서(객체 생성)
		MemberDTO dto = new MemberDTO(id, pw);
		result = dao.delete(dto);
		return result;
		
	}
	

}
