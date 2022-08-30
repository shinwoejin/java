package kr.brains071;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayListExt<String> ale = 
				new ArrayListExt<String>();
		ale.add(new String("고객"));	// index 0에 저장
		ale.add("경험");
		ale.add("데이터를");
		ale.add("활용한");
		ale.add("데이터");
		ale.add("비즈니스");
		ale.add("분석가 과정");
		ale.printHello();
		ale.add();	// add(T) add() 중첩(overloading)
		System.out.println(ale.lastIndexOf("데이터"));  //현재 존재하고있는 요소가 위치해 있는 인덱스 번호 출력
		// for문 : 반복횟수가 정해진 경우 사용, 숫자 접근 가능, 
		// 제어변수 에 따른 접근
		
		for(int i=0; i < ale.size(); i++)
			System.out.print(ale.get(i) + " ");
		
		System.out.println();
		
		//foreach statement : collection 객체의 순차 접근
		for(String s : ale)	
			System.out.print(s + " " );
		
		/*		
		// String name = new String("이름");
		// String color = "좋아하는 색상";
		
		Integer i = 15;
		// i는 Integer 클래스형 변수
		// Integer i = (Integer) 100;
		// implicit type conversion 형변환 : 오토박싱
		int j = 50;
		System.out.println(Integer.toBinaryString(i));
		*/ 
		
		}
}
