import school.ClassRoom;

public class SchoolTest {
	public static void main(String[] args) {
		
		ClassRoom room = new ClassRoom();
		room.입학();
		room.printMe();
		room.입학();
		room.printMe();

		ClassRoom room2 = new ClassRoom();
		room2.입학();
		room2.printMe();
		
		ClassRoom.printMe2();  // static 메서드롤 호출하였다.
		// room2.printMe2();  // static 메서드가 아닌 경우에 해당한다.
		
		
		
		
		
	}	
}
