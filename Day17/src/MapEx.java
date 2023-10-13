import java.util.*;

class Student {
	String name;
	int grade;
	Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	void introduceMySelf() {
		System.out.println(String.format("안녕, 내 이름은 %s, %d 학년이야", name, grade));
	}
}

public class MapEx {

	public static void main(String[] args) {

		Map map = new HashMap();  // new HashTable()  등 중 하나가 됨
		map.put("name", "이종석");
		map.put("age", 30);  // new Integer(30); 이라고 쓰지 않아도 자동으로 Wrapper Boxing (형변환) 됨.
		
		System.out.println(map.get("name"));  // key값을 넣으면 value값이 출력됨.
		System.out.println(map.get("age"));
		
		List list = new ArrayList();
		for(int i=0; i<5; i++) {
			Map m = new HashMap();
			m.put("name","name : " +i);
			m.put("age", "age : " +i);
			m.put("home", "home : " +i);
			list.add(m);
		}
		
		//-- 데이터 꺼내기
		System.out.println("List<Map> 꺼내기");
		System.out.println("Name \t Age \t Home");
		
		for(Object v : list) {
			Map rMap = (Map)v;
			System.out.println(String.format("%s \t %s \t %s \n", 
					rMap.get("name"), rMap.get("age"), rMap.get("home")));			
		}
		
		List studentList = new ArrayList();
		for(int i=0; i<5; i++) {
			studentList.add(new Student("이종석" +i, i));
		}
		
		for(Object v : list) {
			Student std = (Student)v;
//			v.introdueMySelf();
			std.introduceMySelf();					
		}
		
		// List/Set/Map은 Object 타입의 데이터를 저장할 수 있음

		
//		List<Integer> param = List.of("1", "2", "a", "3", 4,5,6, "허얼");  // 문자열이기 때문에 오류남
		List<Integer> param = List.of(1,2,3,4,5,6,7);  // 제너릭으로 정수만 받을 것임을 제한함.
//		List param = List.of("1", "2", 4,5,6);
		int result = sum(param);
		System.out.println("result =" +result);  // 문법적으론 오류 없으나, 컴파일시 오류 남.	=> 보완을 위해 제너릭 기능이 나옴.	
	}		
	
	Map<String, Student> map2 = new HashMap<String, Student>();
	map2.put("1", new Student("이종석", 1));
	map2.put("2", new Student("이종석B", 2));
	map2.put("3", new Student("이종석A", 3));
	map2.get("1").introduceMySelf();
	//map2.get(map2);
	
	Map map3 = new HashMap();
	map3.put("1", new Student("이종석", 1));
	map3.put("2", new Student("이종석B", 2));
	map3.put("3", new Student("aaa"));
	((Student)map3.get("1")).introduceMySelf();
	
	
	public static int sum(List<Integer> list) {  
		
		int result = 0;
		for(Integer v : list) {
			result += Integer.parseInt(v.toString());
		}
		
	return 0;
	}

}
