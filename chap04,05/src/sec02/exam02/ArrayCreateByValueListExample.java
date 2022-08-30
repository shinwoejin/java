package sec02.exam02;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		// 여기서 add 매소드 사용 불가
		
		
		// 값 목록으로 배열을 생성함과 동시에
		// add()메소드의 매개값으로 사용이 new 연산자를 사용함.
		
		int sum2 = add( new int[] {83, 90, 87} );	// add매소드 사용
		// int sum2 = add( int[] {83, 90, 87} )	//;new 미사용시 오류
		System.out.println("총합 : " + sum2);	
		System.out.println();
		//=======================================
		System.out.println("add 메소드 더(여러번) 사용하기 총합 : " + sum2);	
		System.out.println();
	}

	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
