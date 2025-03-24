package ArrayList;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class StudentMain {

	public static void main(String[] args) {
		// 1. Student 자료형을 보관할 수 있는 sList라는 이름을 가진 ArrayList 생성
		ArrayList<Student>sList = new ArrayList<>();
		
		
		//2.데이터 추가(본인 이름, 나이를 가지고 있는 데이터(Student) 추가)
//		Student s1 = new Student("김다현",25);
//		sList.add(s1);
		sList.add(new Student("김다현",26));
		
		//3.이름출력
		System.out.println(sList.get(0));
		System.out.println(sList.get(0).getName());
		//본질적으로 어떤 자료형인지 확인할 것!!
		// sList.get(0)---> return type : Student---> 객체!
		
		//4. 팀원들의 데이터 전부 추가하기!!
		System.out.println("=====팀원정보=====");
		sList.add(new Student("차영주",26));
		sList.add(new Student("옥진석",26));
		sList.add(new Student("권오빈",26));
		//5. 팀원이름,나이 전부 출력 
		
		for(int i =0; i<4;i++) {
			System.out.println(sList.get(i).getName()+sList.get(i).getAge());
		}
		
		for(Student s : sList) {
			System.out.println(s.getName()+"\t"+s.getAge());
		}
		
	}

}
