package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		// java 에서는 리터럴이 같으면 String을 공유한다.
		// 다음 strVar1, strVar2 는 동일 객체를 참조한다.
		
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
 		} else {
 			System.out.println("strVar1과 strVar2는 참조가 다름");
 		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("<공유 : .equals 사용>strVar1과 strVar2는 문자열이 같음");
		}
		
		// 객체 생성 연산자 new 는 Heap영역에 새로운 객체를 만들 때 사용하는 연산자
		
		String strVar3 = new String("신민철");	// new 사용
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("객체 생성 연산자 new 사용 : strVar3과 strVar4는 참조가 같음");
 		} else {
 			System.out.println("객체 생성 연산자 new 사용 : strVar3과 strVar4는 참조가 다름");
 		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("객체 생성 연산자 new 사용<.equals> : strVar3과 strVar4는 문자열이 같음");
		}
		
	}
}
