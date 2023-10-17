
public class Person {
	int stdNo;  // 학번
	String name;  // 이름
	int point;  // 취득 점수
	
	Person(int stdNo, String name, int point) {
		this.stdNo = stdNo;
		this.name = name;
		this.point = point;
	}
	
	@Override
	public String toString() {
		return String.format("학번 : %d / 이름 : %s / 점수 : %d", stdNo, name, point);
	}

}
