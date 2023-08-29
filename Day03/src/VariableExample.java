
public class VariableExample {

	public static void main(String args[]) {
	
		// 1. 변수명은 숫자로 시작할 수 없다.
		//int 4name;  // --에러
		int name4;  // 에러가 아닙니다.
		
		// 2. 변수명에는 _ 와  $ 외의 특수문자는 사용할 수 없습니다.
		//int name#;  // --에러
		int $name_id; // 에러는 아니지만, 적절치는 않다.
		
		// 3. 변수명에는 키워드를 사용할 수 없다.
		//int class;  // --에러
		//int if; // --에러
		int className;  // 에러 아님. 
		int Class_;  // 에러 아니지만, 적철치는 않다.
		className = 10;  // 윗 줄에 생성한 변수에 값을 넣었다.
		//int className;  // --에러. 변수명은 중복선언될 수 없다.
		
		
	}
}
