import java.util.*;
import java.util.stream.Stream;

public class MyApp {

	public static void main(String[] args) {
		
		List<Person> list = List.of(
				new Person(1, "A", 100),
				new Person(2, "B", 40),
				new Person(3, "C", 50),
				new Person(4, "D", 20)			
				);
		
		System.out.println(list);
		
		
		//-- list의 내용을 전체 출력하라
		// 1. 기본 for
		System.out.println("향상된 for문 ==========");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		// 2. 향상된 for문
		System.out.println("향상된 for문 ==========");
		for(Person p : list) {
			System.out.println(p);
		}
		
		// 3. forEach(람다식) 사용  
		System.out.println("forEach(람다식) ==========");	
		list.forEach(v -> System.out.println(v));  // forEach는 인자로 Consumer를 받아서 람다식 사용 가능함.
//		list.forEach(System.out::println);  // ::(메소드) 연산자 사용 가능
		
		// 조건: 점수가 50점 이상인 사람을 goodPerson 리스트에 담고 싶다.
		List<Person> goodPersonList = new ArrayList<Person>();
		// for문도 되고 향상된 for문도 되고, forEach(람다)도 가능
		list.forEach(x -> {
			if(x.point >= 50 ) {				
			goodPersonList.add(x);
			}
		});
		
		System.out.println(goodPersonList);
		
		
		// Stream -> 편하자고 쓰는 것 (필수 아님)
		// 1. 생성 -> Source(원본)
		// 2. 처리 -> 중간처리 (filter(), map() ...)
		// 3. 종결 -> toList(), collect(), reduce() ...
		
		// 조건: 점수가 50점 이상인 사람을 goodPerson2 리스트에 담고 싶다.
		// 1. 원본 생성(Stream<T>) => list.stream(); // 컬렉션 APE에서 stream 소스 생성
		List<Person> goodPersonList2 = list.stream()  // 1. 생성(Source)
											.filter(val -> val.point >= 50)  // 2. 중간처리 ->  이 경우 중간처리에서의 필터 리턴타입은 List<Person>임
											.filter(val -> val.name.equals("A"))  // 중간처리는 여러개여도 됨.
//											.collect(Collectors.toList())  // jdk 16(?) 이하. 그 이상은 toList()로 사용함.
											.toList();  // 3. 종결
//											.filter(System.out::println);  // 종결 이후에 필터를 사용하면 에러남. 닫힌 스트림은 더 이상 활용할 수 없음.
		
		System.out.println(goodPersonList2);
		
		
		// map/flatmap
		// map은 일반적으로 A타입을 B타입으로 변경할 때 사용함.
		// flatmap은 여러 개의 collection을 모두 flat하게 저장하고 변경 가능함
		
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		
		
		//-- 3 이상인 값들에 + 65를 해서 char List로 바꾸고 싶다
		List<Character> processed = stream.filter(x -> x>= 3)
				.map((x) -> new Character((char)(x +65)))
				.toList();
		
		System.out.println(processed);
		
		String[][] sample = new String[][] {
			{"a", "b"},
			{"c", "d"},
			{"e", "f"},
			{"1", "a"}
		};		
		
		
		Stream<String[]> st = Arrays.stream(sample);  // 1. 생성(Source)
		
		// 1. 소스 얻기(Stream)
		List<String> list2 = 
				st.flatMap(arr -> Arrays.stream(arr))  // 2. 중간 처리
				.distinct()  // 중복 제거
				.sorted()  // 기본 ASC 오름차순으로 정렬
//				.sorted((x,y) -> {
//					// [1,2,3]  // stream 시작이 1.
//					// x -> 2,  y -> 1
//					return Integer.parseInt(x) > Integer.parseInt(y) ? 1 : Integer.parseInt(x) < Integer.parseInt(y) ? -1:0;
//					})
				.sorted(Comparator.reverseOrder())  // 내림차순
				.toList();  // 3. 종결
		
		System.out.println(list2);
		
		
		// String[][] -> String[] 2차원 배열을 1차원 배열로 바꾸고 싶다
//		String[] resultArr;
//		st.filter((x) -> true);  // 이미 st라는 스트림은 생성부터 종결까지 진행되었기 때문에
								// 닫힌 스트림은 재사용 못하므로 새로 만들어야 함.
		
		String[] resultArr = Arrays.stream(sample)
									.flatMap(array -> Arrays.stream(array))
									.filter(x -> {
										return x.equals("a");
									})
									.peek(x -> System.out.println(x))  // -> forEach는 종결자이므로 기능이 같은 중간연산자인 peek를 이용해 중간처리함.
									.toArray(String[]::new);  // ::메서드 연산자(호출만 가능한 인자가 0개/1개인 연산자)
				
		System.out.println(resultArr);
		
		
		
		
		
		
		
		
	}

}
