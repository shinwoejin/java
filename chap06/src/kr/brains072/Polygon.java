package kr.brains072;

// 다각형의 넓이는 구하기 위한 클래스를 정의하고, (객체생성), 활용
public abstract class Polygon {
	// 삼각형, 직사각형, 정사각형, 평생사변형, 사다리꼴
	private int height;	// 세로
	private int width;	// 가로
	private int depth;	// 적층 : 기둥의 부피
	private int area;	// 넓이
	private String name; 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Polygon() { }// Polygon 기본 생성자 : 명시적으로 생성		
	
	public Polygon(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public void setHeight(int h) {
		this.height = h;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int w) {
		width = w;
	}
	
	public int getWidth() {
		return width;
	}
	
	public abstract int evaluate();	//추상메소드 : 상속받는 쪽에서 구현
	
}
