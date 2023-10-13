
class User {
	String name;
	int age;
	User(String name, int age) {
		this.name = name;
		this.age = age; 
	}
	
	
//	boolean isSameUser(User user) {  // 동명이인인가?
//		return this.name.equals(user.name);
//	}
//		
//	boolean isSameUser2(User user) {  // 동명이인 이고 + 나이도 같은가?
//		return this.name.equals(user.name) && this.age == user.age;
//	}
//}


		
	
interface InterA {
	boolean isSameUser(User user1, User user2);
	boolean isSameUser2(User user1, User user2);
}

// (람다) 함수형 인터페이스
@FunctionalInterface
interface InterB {
	boolean isSameUser(User user1, User user2);  
	// (x, y) -> x.name.equlas(y.name);
//	boolean isSameUser(User user1, User user2) {
//		return user1.name.equals(user2.name);
//	}
//	boolean isSameUser2();  // 람다식은 1:1로 매핑되어야 함. 추상메서드는 하나의 인터페이스에 하나만 들어갈 수 있으므로 에러.
//							// 구현부가 있는 default 메서드는 추가 가능함.
	default void printName() {
		System.out.println("허얼");
	}
}

public class Lambda {

	public static void main(String[] args) {

		User user1 = new User("이종석", 10);
		User user2 = new User("이종석", 29);
		System.out.println("동명이인? : " +user1.isSameUser(user2));
		System.out.println("동명이인+동갑? : " +user1.isSameUser2(user2));
		
		// 익명객체
		InterA func = new InterA() {
		boolean isSameUser(User user) {  // 동명이인인가?
		return this.name.equals(user.name);
	}
		
	boolean isSameUser2(User user) {  // 동명이인 이고 + 나이도 같은가?
		return this.name.equals(user.name) && this.age == user.age;
	}		
	};
		
	System.out.println("동명이인? : " +user1.isSameUser(user2));
	System.out.println("동명이인+동갑? : " +user1.isSameUser2(user2));

	
	// 람다식
	// boolean isSameUser(User user1, User user2);
	InterB a = (x, y) -> x.name.equals(y.name);  // 한 줄일 때 사용.
//	InterB a = (x, y) -> {  // 이렇게 쓰는 것도 가능함. 여러줄 쓸 때 사용.
//		return x.name.equals(y.name);
//	};
	InterB b = (t, v) -> t.name.equals(v.name) && t.age == v.age;
	
	System.out.println("동명이인? : " +a.isSameUser(user1, user2));
	System.out.println("동명이인+동갑? : " +user1.isSameUser2(user2));
}
	
	
	}
