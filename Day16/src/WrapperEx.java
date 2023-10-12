
public class WrapperEx {

	public static void main(String[] args) {
		
		//-- 자동 형변환
		Integer x = new Integer(1);  // 가능한 방법이지만 지양하라고 작대기 그어짐.
									 // Integer.valueOf(1); 이라고 작성하는 걸 추천.
		Integer y = 1;  // Boxing. new 없이 형변환 없이 가능함
		int z = new Integer(1);  // unBoxing
		
		

	}

}
