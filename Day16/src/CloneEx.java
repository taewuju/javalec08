

class Member implements Cloneable { 	// implements Cloneable을 쓰면 복제가능한 클래스임을 선언하는 것임. 
										// (Cloneable은 마크드 인터페이스로서 clone()메서드 사용에 필요함)
										// extends Object
	String name;
	
	Member(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println(String.format("Hello, %s", name) );
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return String.format("name %s @ %s",  this.name, this.hashCode());
	}

	@Override
	public boolean equals(Object m) {
		return this.name.equals(((Member)m).name);
	}

}

public class CloneEx {
	
	public static void main(String args[]) throws Exception {
		
		Member member = new Member("이종석");
		Member member2 = member;  // 얕은 복사. 같은 곳을 참조하게 됨.
		Member member3 = (Member)member.clone();  // 깊은 복사. Object클래스이므로 하위 클래스로 형변환해야 함.
		int[] a = {1,2,3};
		int[] b = a;  // 얕은 복사
		int[] c = a.clone();  // 깊은 복사
		
		System.out.println(member);
		System.out.println(member2);
		System.out.println(member3);
		
		member2.name = "허얼";
		
		System.out.println(member);
		System.out.println(member2);
		System.out.println(member3);
		
		// equals() => 객체의 주소인 해시코드를 비교
		Member m1 = new Member("이종석");
		Member m2 = new Member("이종석");
		System.out.println("m1 == m2 = " +(m1 == m2));
		System.out.println("m1.equals(m2) =" +(m1.equals(m2)));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
