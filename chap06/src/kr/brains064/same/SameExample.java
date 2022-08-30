package kr.brains064.same;

// 같은 패키지에 존재하는 클래스는 import 없이 사용가능

import kr.brains064.other.Other;
import kr.brains064.other.Protected;


public class SameExample {

	public static void main(String[] args) {
		Same same = new Same();
		System.out.println("Same Package");
		//System.out.println(same.privateField);
		System.out.println(same.defaultField);
		System.out.println(same.protectedField);
		System.out.println(same.publicField);
		
		/*SameExample se = new SameExample();
		System.out.println("Inheritance Relationship : 상속관계");
		//System.out.println(se.privateField);
		//System.out.println(se.defaultField);
		System.out.println(se.protectedField);
		System.out.println(se.publicField);*/
			
		Other other = new Other();
		System.out.println("Other Package");
		//System.out.println(other.privateField);
		//System.out.println(other.defaultField);
		// protected 가 되려면 상속 관계가 있어야 함.
		//System.out.println(other.protectedField);
		System.out.println(other.publicField);
		
		
	}

}
