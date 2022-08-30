package kr.brains072;

public class Trapezoid extends Polygon{
	
	private int upper;	//윗변
	
	public Trapezoid(int height, int width, int upper) {
		super(height, width);	// 수퍼클래스의 생성자를 호출, width : 아랫변, height : 높이
		this.upper = upper;
		setName("Trapezoid");
	}
	public int getUpper() {
		return upper;
	}
	@Override
	public int evaluate() {
		int area = (getWidth() + getUpper()) * getHeight() / 2;
		return area;
	}

}
