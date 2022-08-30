package chap06.note;

public class note05 {
	
	// Java Fundmental (Core)
	// Java Tokens :
	// - 예약어(식별자 사용 불가), 연산자, 구분자(; , {}), 주석(//)
	// - 식별자(변수, 상수변수, 메소드명, 클래스명...), 리터럴(100,"hi", (true, false, null))
	 
	// Java Statement -> field 선언, method 정의
	// - 배정문(assignment) : 변수 = 식; // 식은 식별자, 리터럴, 연산자, 메소드 호출 모음
	// i = i + 1; iRef = new String("Hi");
	// - 조건문(if, switch), 반복문(for, while, do~while), 
	// - 점프문(break, continue, return)
	
	// Class 정의, Object 생성, Instance 들 간의 상호 작용
	// 캡술화, 상속성(abstract class), 다향성(interface abstract class)
	
	// Modules, Packages, Java API, Exception Handling
	// Java I/O (input, output), 
	// JDBC(Java DataBase Connectivity)
	// 제너릭(Generics), JCF(Java Collention Framework)
	
	// Thread, AWT, Swing
	// Java 기반 Servlet, JSP(Java Server Pages), Spring Framework
	
	// 예외와 예외 클래스
	// 실행 예외
	// 키워드로 끝내는 핵심 포인트
	// 예외 (Exception)
	// - 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인해 발생하는 프로그램 오류
	// - 예외 처리 프로그램 통해 정상 실행상태 유지 가능
	// - 예외 발생 가능성이 높은 코드 컴파일할 때 예외 처리 유무 확인
	
	// 예외 (실행시간에 발생한 오류)
	// - 예외(Exception) : 처리를 통해서 회피, 지속할 수 있는 덜 심각한 문제 - 사용자, 개발자
	// - 에러(Error) : 처리를 통해 처리할 수 없는 심각한 오류 - 시스템 쪽
	
	// 일반 예외(checked exception : jvm 체크 안하기 때문에 개발자가 꼭 해줘야함)
	// - 컴파일러 체크 예외
	// - 자바 소스 컴파일 과정에서 해당 예외 처리 코드 있는지 검사하게 됨
	
	// 실행 예외(runtime exception - uncheck exception : jvm 이 체크 해주는것)
	// - 컴파일러 넌 체크 예외
	// - 실행 시 예측할 수 없이 갑자기 발생하기에 컴파일 과정에서 예외처리코드 검사하지 않음
	
	// 개발자의 경험에 의해서 예외 처리 코드 작성해야 함
	// - 예외처리코드 없을 경우 해당 예외 발생 시 프로그램 종료
	
	// NullPointException
	// - 가장 빈번하게 발생하는 실행 예외
	// - java.lang.NullPointException
	// - 객체 참조가 없는 상태의 참조 변수로 객체 접근 연산자 도트를 사용할 경우 발생
	
	// catch 문은 여러개 쓸수있음.
	// catch 순서
	// - 다중 catch 블록 작성 시 상위 예외 클래스가 하위 예외 클래스보다 아래 위치해야 함
	
	// 입출력 스트임의 종류
	// 바이트 기반 스트림
	// - 그림, 멀티미디어 등의 바이너리 데이터를 읽고 출력
	// 문자 기반 스트림
	// - 문자 데이터를 읽고 출력할대 사용
	
	// File 클래스
	// - File 객체는 파일 입출력 스트림 객체 생성 시 경로 정보 제공 목적으로도 사용됨
	// - 스트림 생성자에 문자열 경로 대신 File 객체를 대입
	// FileReader fr = new FileReader(file) //문자 단위
}



