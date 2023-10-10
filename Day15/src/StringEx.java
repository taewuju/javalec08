
public class StringEx {

	public static void main(String[] args) {
		
		String a = "이종석";
		a = a + "만세";
		
		// string interpolation (치환. 중간에 값 넣기)
		String val = "안녕하세요. 내 이름은 %s입니다. 나이는 %d살 이예요.";
		val = String.format(val, "이종석", 10);
		System.out.println(val);

		// StringBuffer 클래스, StringBuilder 클래스
		// StringBuffer Thread-Safe => 하나의 객체를 여러 스레드에서 이용해도 안전함. 대신 성능 좀 낮아짐.
		// StringBuilder Thread-unSafe => 여러 스레드에서 이용시 안전하지 않음. 대신 성능 더 좋아짐.
		
		String name = new String("이종석");  // string pool이 아닌 별도의 공간에 만들어지므로 "이종석"; 과 다름
		StringBuffer nameBuff = new StringBuffer("이종석");
		StringBuilder nameBuild = new StringBuilder("이종석");
		
		name = name + "만세";
		nameBuff.append("만세");
		nameBuild.append("만세");
		
		System.out.println("String : " +name);
		System.out.println("StringBuff : " +nameBuff);
		System.out.println("StringBuild : " +nameBuild);
		
		// 보이는 결과는 같지만.
		// 문자열이 많아질수록, 연산이 많아질수록, 성능은
		// StringBuilder > StringBuffer >> 4차원의 벽 >>> String
		// +(플러스) 연산은 하지 않는 것이 좋음.
		
	}

}
