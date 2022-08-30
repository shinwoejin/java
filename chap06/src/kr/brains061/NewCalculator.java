package kr.brains061;

public class NewCalculator {
	// 10 + 20 ; 10, 20 피연자, + 연산자
	// access modifier : 접근 수정자, 접근 식별자
	// public(누구나), 
	// protected, (같은 패키지에 있지 않아도 상속 관계에 있으면 사용),
	// 기본(아무것도 쓰지 않음, 같은 패키지에 있는 클래스들만 사용가능), 
	// private(나만 사용할때)
	
	private int operand1;
	private int operand2;
	private String operator;
	
	// constructor : 객체 초기화
	// this : 
	public NewCalculator(){ // 기본(default) 생성자
		this(10, "+", 20);
		/*
		this.operand1 = 10;
		this.operator = "+";
		this.operand2 = 20; */
	}
	
	public NewCalculator(int o1, String op, int o2) {
		//this();
		
		this.operand1 = o1;
		this.operator = op;
		this.operand2 = o2;
	}
	
	// custom method
	// int : 번호나 유형, 리턴 타입 - 메소드 처리 후 반환하는 값의 유형
	public int calc() { // int calc : 선언부, 그뒤 { } : 몸통(method body)
		int operand3 = 0; // = 0 을 넣어 초기화하거나 값을 넣어 사용.
		System.out.println(operand3); // 지역변수 초기화 후 사용하거나 값을 넣어 사용
		int result = 0;	// result : 지역변수
		if(operator.equals("+"))
			result = operand1 + operand2;	// operand1.. : 인스턴스 변수
		else if(operator.equals("-"))
			result = operand1 - operand2;
		else if(operator.equals("*"))
			result = operand1 * operand2;
		else if(operator.equals("/"))
			result = operand1 / operand2;
		return result;
	}
}
