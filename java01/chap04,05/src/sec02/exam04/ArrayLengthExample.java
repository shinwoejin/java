package sec02.exam04;

public class ArrayLengthExample {

	public static void main(String[] args) {
		 int[] scores = {83, 90, 87}; // 3 size
		// scores index : [0], [1], [2]
		
		int sum = 0;
		// i<scores 사용한 이유 배열의 마지막 인덱스는 배열 size보다 1적기 때문
		// i<=scores 는 마지막 수 포함이라 에러
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		//=====================
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}

}
