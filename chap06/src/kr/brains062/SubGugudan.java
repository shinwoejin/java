package kr.brains062;

// Gugudan 클래스가 같은 패키지에 있는 경우(향후 import 되었거나)
public class SubGugudan extends Gugudan {

	public SubGugudan(int dan) {
		super(dan); // this([매개변수목록]) : 현재 클래스의 생성자를 호출
		// super([매개변수목록]) : 부모클래스(수퍼클래스) 의 생성자를 호출
	}

		// direction : up, down - up dan - > 9단, down 2단 -> dan
		// 메소드를 중첩(overloading)
		public void printFrom(int dan, String direction) {
			System.out.println("메소드 오버로딩");
		}
}

// overloading(중첩 - 메소드 이름 같고, 매개변수 타입, 갯수가 다름)
// overriding(재정의 - 메소드 이름같고, 매개변수 타입과 갯수까지 같음)