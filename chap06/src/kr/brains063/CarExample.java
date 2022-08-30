package kr.brains063;

// import java.util.ArrayList;

public class CarExample {
	// public final class가 붙은 class 는 상속 불가능. (String, Integer)
	String programName = "CarExample"; // class보다 static 메소드가 먼저 실행됨
	
	public CarExample() {
		// 기본생성자
		// 없을땐 컴파일시 컴퓨터가 자동으로 생성, 하나라도 있다면 생성하지 않음.
	}
	
	public static void main(String[] args) {
		
		CarExample ce = new CarExample(); 
		// System.out.println(programName); // error // ce.을 넣어 오류 수정
		System.out.println(ce.programName);
		
		// setGet() 정적 메소드가 아니므로 객체 생성후 접근 가능
		// Car.model = "전기차";  //final 이 붙으면 수정 불가능, 상수변수
		System.out.println("현재 모델 : " + Car.MODEL);
		System.out.println("가장큰 int 값 : " + Integer.MAX_VALUE);
		int i = 1_000_000_000; //구버전일 경우 에러날 가능성있음.
		int j = 1000000000;
		//System.out.println("현재 모델 : " + car.setGas("70L")); //error
		// String은 객체 생성전에 사용가능
		
		Car car = new Car(); // 객체 생성
		//car.model = "전기차";	// 직접 인스턴스 변수 값 배정(assignment)
		//car.setGas(30);	//30L : setter 를 이용한 값 배정 : "30L" 문자열, 
		car.setGas("14L"); 	// 검증된 값을 배정
		System.out.println("현재 Gas : " + car.getGas() + "L");
		
		car.run();		
		
		/*
		String str = "현대자동차";
		System.out.println(str.charAt(3));
		//.charAt()을 붙여 그 인덱스 위치에 있는 문자 출력
		int i = 166;
		// Integer : int 기본형을 효과적으로 조작하기 위해 정의한 클래스
		// Wrapper Class : 기본자료형을 효과적으로 조작하기 위해 정의한 클래스
		System.out.println(Integer.toHexString(i));
		System.out.println(Integer.toBinaryString(i)); // 2진수
		*/
	}
}
