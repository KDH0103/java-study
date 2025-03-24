package Modle;

public class MemberDTO {
	// [DTO]
	// -> Database Transfer Object

	private String id;
	private String pw;
	private String name;
	private int age;
	
	
	//값을 담는 생성자 메소드가 있다면,
	//아무것도 담지 않는 기본 생성자 메소드를
	//만들어 한다!
	public MemberDTO() {
		
	}

	// 회원가입을 위한 생성자 메소드
	public MemberDTO(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	
	//회원 조회를 위한 생성자 메소드
	public MemberDTO(String id, String name,int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	//회원 삭제를 위한 생성자 메소드
	public MemberDTO(String id, String pw) {
		this.id = id;
	
		this.pw = pw;
		
	}
	
	
	
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	//setter메소드
	//매개변수로 받은 값을 객체의 데이터에 반영
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public void setName(String name) {
		this.name = name;
	}


	// getter
	// DTO의 데이터들은 private이기 때문에
	// getter 메소드를 사용해야 다른 파일에서 조회가 가능

}
