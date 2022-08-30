package sec02.exam03;

public class ForSumFrom1To100Example2 {

	public static void main(String[] args) {
		int sum = 0;		// 합계 변수
		
		int i = 0;		// 루프 카운터 변수
		for(i=1; i<=100; i++) {  // i = 101
			sum += i;
		}
		System.out.println("i반복은 한번 더 실행후에 for loop탈출 " + i);
		System.out.println("1~" + (i-1) + " 합 : " + sum);
		
		/*int sum = 0;		
		
		int i = 0;		
		//for(i=1; i<=20; i++) {
		//for(i=1; i<=20; i+=2) { // 홀수 i+=2
		//for(i=0; i<=20; i+=2) { // 짝수 i=2
		for(; i<=20; i+=2) { // 짝수 i=2
			sum += i;
			System.out.println("i:" + i);
		}
		System.out.println("i반복은 한번 더 실행후에 for loop탈출 " + i);
		System.out.println("1~" + (i-1) + " 합 : " + sum);*/
	}

}
