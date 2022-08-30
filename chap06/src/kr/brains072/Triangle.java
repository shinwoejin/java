package kr.brains072;

public class Triangle extends Polygon {
	// 생성자 : 객체 초기화를 담당, 
	// sub 클래스로부터 객체를 생성할, 
	// super 클래스의 객체(필드, 메소드)도 준비되어 있어야 함
	public Triangle(int height, int width) {
		super(height, width);
		setName("Triangle");
	}

	@Override
	public int evaluate() {	//메소드 선언부 : 사용법 또는 활용법
		int w = getWidth();
		int h = getHeight();
		int area = h * w / 2;
		// int area = getHeight() / 2 * getWidth();	
		// int area = getHeight() * getWidth() / 2;
		return area;
	}
	
}
