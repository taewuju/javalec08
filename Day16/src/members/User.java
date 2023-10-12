package members;

public class User {
	
	private String name;
	private String id;
	private String password;
	
	//-- 생성자
	public User() {}
	
		public User(String name, String id, String password) {
			this.name = name;
			this.id = id;
			this.password = password;
		}
	
	//-- 행위(메서드
	public void printUserInfo() {
		System.out.println(String.format("id:%s, name:$s", name, id));
	}
	
	private void printUserPassword() {
		System.out.println(String.format("[pwd:%s]", password));
	}
}
