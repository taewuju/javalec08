import java.util.*;

public class CollectionEx {

	public static void main(String[] args) {
		
		// 1. list
		List list = new ArrayList();  // 생성방법 1. 많이 쓰임.
		list.add(0);
		list.add(1);
		list.add(2);  // ...
		list.add(0);
		System.out.println(list);  // 입력한 순서대로 출력되고, 중복 허용됨.
		
		list = Arrays.asList(1,2,3,4,5);  // 생성방법 2.
		System.out.println(list);
		
		list = List.of(1,2,3,4,5,6);  // 생성방법 3. 많이 쓰임.
		System.out.println(list);
		
		int[] t = {1,2,3,4,5};  // 생성방법 4.
		System.out.println(Arrays.asList(t));
		
		// 전체 출력하기
		System.out.println("전통 for문");  // 출력방법 1.
		for(int i=0; i<list.size(); i++) {  // list의 크기보다 작은 동안
			System.out.println(list.get(i));  // 진짜 배열인건 아니기 때문에 list[i]는 불가
		}
		
		System.out.println("향상된 for문");  // 출력방법 2.
		for(Object v : list) {
			System.out.println(v);
		}
		
		System.out.println("Lambda식");  // 출력방법 3.
		list.forEach(x -> System.out.println(x));
		list.forEach(System.out::println);
		
		
		//-- List 줄이기 늘이기 (배열을 방의 수가 정해지면 끝)
		System.out.println("List길이 가지고 놀기");
		List testList =  new ArrayList();  // List.of(1,2,3,1,1);하면 상수(불변 객체) 되므로 안 됨.
		testList.add(1);
		testList.add(2);
		testList.add(3);
		System.out.println(testList);
				
		//-- 길이 늘이기
		testList.add(10);  //--> 1,2,3,1,1,10
		System.out.println(testList);
		testList.add(2,-10);  //--> 1,2,?,3,1,1,10 두 번째 인덱스에 -10 넣기
		System.out.println(testList);
		
		//-- 길이 줄이기
		testList.remove(0);  //--> 2,-10,3,1,1,10
		System.out.println(testList);	
		
		
		
		// 2. Set
		System.out.println("Set 가지고 놀기");
		Set set = new HashSet();
		set.add(0);
		set.add(1);
		set.add(2);
		set.add(0);
		System.out.println(set);  // 입력 순서 유지 안 되고, 중복 허용 안 됨(제거됨).
		
		// 전체 출력하기
//		System.out.println("전통 for문");  // 출력방법 1.
//		for(int i=0; i<set.size(); i++) {  // set의 크기보다 작은 동안
//			System.out.println(set.get(i));  // 진짜 배열인건 아니기 때문에 set[i]는 불가
//		}
				
		System.out.println("향상된 for문");  // 출력방법 2.
		for(Object v : set) {
			System.out.println(v);
		}
				
		System.out.println("Lambda식");  // 출력방법 3.
		set.forEach(x -> System.out.println(x));
		set.forEach(System.out::println);		
				
		//-- Set 줄이기 늘이기 (배열을 방의 수가 정해지면 끝)
		System.out.println("Set길이 가지고 놀기");
						
		//-- 길이 늘이기
		set.add(10);  //--> 1,2,3,1,1,10
		System.out.println(set);
				
		//-- 길이 줄이기
		set.remove(0);  //--> 2,-10,3,1,1,10
		System.out.println(set);			

	}

}
