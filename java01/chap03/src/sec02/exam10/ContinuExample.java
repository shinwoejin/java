package sec02.exam10;

public class ContinuExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			// 2로 나눈 나머지가 0이아닐경우, 홀수인 경우
			if(i%2 != 0) {	// even 짝수
			//if(i%2 == 0) {	// odd 홀수
				continue;
			}
			System.out.println("Even : " + i);	// 홀수는 실행되지 않음
		}
	}

}
