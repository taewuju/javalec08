import java.util.*;

class A {}

class GenericClass<T> extends A {
	
	private T data;
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public void getClassInfo() {
		System.out.println(String.format("class info : %s", data.getClass()));
	}
	
}


public class GenericEx {

	public static void main(String[] args) {
	
		GenericClass<Integer> cls = new GenericClass<Integer>();
		GenericClass<String> cls2 = new GenericClass<String>();
		
		cls.setData(1);
		cls.getClassInfo();
		
		cls2.setData("이종석");
		cls2.getClassInfo();
	
		Number a = new Integer(1);  // 공변성. 자동으로 변환가능한 것.
		GenericClass b = (GenericClass)new A();  // 번공변성. 자동으로 변환 불가한 것
		// 불공변성은 둘 다 안 되는 것
		
		A c = new GenericClass();  // A <- G 형변환. G는 A의 자식이므로.	
	
//		Map<?> map = new HashMap<String>();
		
//		List<Object> d = new List<Integer>();  // 변환 불가. 아랫줄처럼 ? extends로 해결가능함.	
		
	}
	
	static int add(List < ? extends Number> list) {  // extends를 쓰면 상향제한(특정클래스의 자식들만 받기) 가능. 
												   // ?(any라는 뜻)를 쓰면 모든 클래스를 받겠다는 뜻.
												  // 반대로 super를 쓰면 하향제한(특정클래스의 부모들만 받기)도 가능.
		int result = 0;
		for(Number v : list) {
			result += Integer.parseInt(v.toString());
		}
		return result;
	}
	
	
	
	
	
	
	
	

}
