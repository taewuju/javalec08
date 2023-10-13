import java.util.*;

public class OldFashion {

	public static void main(String[] args) {
		
		List list = List.of(1,2,3,4,5,6,7);
		
		for(Object v : list) {
			System.out.println(v);
		}
		
		System.out.println("Iterator======");
		
		// 1.Iterator -> cursor
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
