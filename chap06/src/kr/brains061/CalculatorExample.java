package kr.brains061;

// 하나의 파일에는 public class가 하나만 존재함
// 파일 이름은 public class 가 있는 경우 public class 이름임
// public class 가 없는 경우 이름은 선택가능함.
// class의 이름은 대문자로 시작한다.
// 생성자는 class 이름과 같고, 반환 유형이 없다.

public class CalculatorExample {
	public static void main(String[] args) {
		// 기본 생성자(매개변수가 없는) 호출하여 객체를 생성
		 // calculator : 객체 참조 변수
		
		String str = "현대자동차";
		System.out.println(str.substring(2,4));
		
		NewCalculator calcRef = new NewCalculator();
		System.out.println(calcRef.calc());
		// GC (Garbage Collection) 동작으로 메모리에서 향후 제거
		calcRef = new NewCalculator(23, "*", 40);
		System.out.println(calcRef.calc());
		
		ModCalculator modRef = new ModCalculator(23, "*", 40);
		System.out.println(modRef.calc());
	}
}
