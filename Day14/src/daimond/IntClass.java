package daimond;

public class IntClass implements intA, intB { // default 메서드가 있으므로 
											// 인터페이스 하나만 구현할 때는 오버라이드(재정의) 안해도 오류나지 않지만,
											// 둘 이상일 때는 어느 인터페이스에 있는 메서드인지 오버라이드 하거나
											// 또는 기존 메서드와 별개로 새로운 오버라이드를 해줘야 함.

	@Override
	public void printName() {
		
//		intA.super.printName();
//		intB.super.printName();  // 어느 엔터페이스에 있는 메서드인지 재정의 해주거나,
		System.out.println("하악하악");  // 기존 인터페이스와 별개로 새로 재정의도 가능함.
		}  
	
	
}
