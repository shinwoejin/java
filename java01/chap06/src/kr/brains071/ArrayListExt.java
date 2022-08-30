package kr.brains071;

// 같은 패키지에 존재하는 클래스나 java.lang 패키지에 포함된 클래스는 
// import 없이 사용가능

import java.util.*; // ArratList
// 컴파일러에게 지정판 패키지의 클래스 사용을 알림
// import java.lang.String;	
// java.lang 에 포함되어 있어 생략 가능.

// JCF : Java Collection Framwork
// 이해 : 상속, 추상클래스, 인터페이스, 제너릭(Generics)
public class ArrayListExt<T> extends ArrayList<T>{
	// kr.brains062.ArrayListExt
	public void printHello() { // 메소드 추가
		System.out.println("클래스, 객체, 상속 어렵다");
	}
	public boolean add() {	
		// 중첩 : 이름같고, 매개변수 갯수, 타입 다름(기존 메소드 사용 가능)
		super.add((T) "신우진");
		// System.out.println("자바프로그래밍");
		return true;
	}
	public int lastIndexOf(Object o) {
		// 재정의 : 이름, 갯수, 타입 같음(기존 메소드 사용 불가)
		return 100;
	}
}
