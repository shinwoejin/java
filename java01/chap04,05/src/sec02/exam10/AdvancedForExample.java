package sec02.exam10;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };
		// int[][] scores = { {95, 71, 84} , {93, 87}  };
		// Not AdvancedForExample
		
		int sum = 0;
		for(int score : scores) {		// AdvancedForExample
			sum = sum + score;
		}
		System.out.println("total = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("avg = " + avg);
	}

}
