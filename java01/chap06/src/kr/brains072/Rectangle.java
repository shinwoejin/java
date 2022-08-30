package kr.brains072;

public class Rectangle extends Polygon {
	public  Rectangle(int height, int width) {
		// super 클래스 내에 기본 생성자가 존재한다면
		// 컴파일러가 묵시적으로 super 클래스의 해당 생성자를 호출
		// super(height, width);
		setName("Rectangle");
	}
	
	@Override
	// annotation : 어노테이션, 에노테이션
	//  = 컴파일러에게 컴파일을 잘 할 수 있도록 정보를 제공
	//재정의 : 메소드 이름, 매개변수 갯수, 타입 동일
	public int evaluate() {	
		return (getHeight() * getWidth());
	}

}
