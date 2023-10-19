package connect;

import java.util.ArrayList;
import java.util.List;

import entity.Student;

public class CollectionDBConnect {
	
    private static final List<Student> students = new ArrayList<Student>();

    public static List<Student> getConnection() {
        return students;
    }

    public void closeConnection() {};
}
