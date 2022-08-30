package chap06.note;

public class note02 {

	// 인스턴스 = 변수
	// 정적변수 = static
	// public static void main... (정적메소드)
	// 정적변수는 메모리에 상주한다.
	// static은 항시 메모리(heap)에 존재(적제)한다.
	// 메모리 = (code, static, stack, heap)
	// 프로그램을 실행하면 code, static 이 실행
	// stack에 참조변수 생성후 heap에 객체 생성
	// String 은 문자열을 효율적으로 다루기 위한 class
	// 메소드 = 인스턴스메소드 정적메소드
	
	// 인스턴스 멤버
	// - 객체 마다 가지고 있는 멤버
	// - 인스턴스 필드(instance field variable)
	//   : 힙 영역의 객체마다 가지고 있는 메법, 객체마다 다른 데이터를 저장
	// 인스턴스 메소드 : 객체가 있어야 호출 가능한 메소드,
	// 클래스 코드(메소드 영역)에 위치하지만, 이해하기 쉽도록 
	
	// this : 생성될 객체 자신을 가리키는 예약어
	// - 객체 내에서 인스턴스 멤버에 접근하기 위해 사용
	// - 생성자와 메소드의 매개 변수 이름이 필드와 동일할 경우, 필드 임을 지정하기 위해 주로 사용
	
	// 패키지 선언
	// - 패키지 선언, import문, 접근 제한자, Getter/Setter
	
	// 클래스 구성요소(필드, 메소드, 생성자, Getter/Setter)
	
	// 접근 제한자
	// - 클래스와 인터페이스 및 이들이 가진 멤버(필드, 메소드)의 접근 제한
	// - Getter/Setter 메소드 : public, public void setGas(String s)
	// public 접근 제한자
	// - 외부 클레스가 자유롭게 사용할 수 있도록 함
	// protected 접근 제한자 : protected <return type> <member_name>
	// - 같은 패키지 또는 자식 클래스에서 사용할 수 있도록 함
	// default접근 제한 : void rim(){}
	// - 같은 패키지에 소속된 클래스에서만 사용할 수 있도록 함
	// private 접근 제한자 : private <return_type> <member_name>
	// - 외부에서 사용할 수 없도록 함, 클래스 내부에서만 사용
	
	// public abstract class String{}
	// 재정의 하기위해 일부 구현한 추상클래스
	/*
	public class same {}
	class other {}
	public final class String {}
	public abstract class String{}

	private class {}(X)
	protected class {} (X)
	*/
	
	// Setter 메소드
	// - 외부의 값을 받아 필드의 값을 변경하는 것이 목적
	// - 매개값 검증하여 유효한 값만 필드로 저장할 수 있음
	// Getter 메소드
	// - 외부로 필드값을 전달하는 것이 목적
	// - 필드값을 가공해서 외부로 전달할 수도 있음.
	// Gettet/Setter :
	// - 필드 값을 외부로 리턴하는 메소드를 Getter(getXXX(), isXXX())
	// - 외부에서 값을 받아 필드값을 변경하는 메소드를 Setter(setXXX())
	
	}
