package sec02.exam;

public class exam05 {
	public static void main(String[] args) {
		
		int[][] arrat = { {95, 86},
								 {83, 92, 96},
								 {78, 83, 93, 87, 88} };
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for(int x=0; x<arrat.length; x++) {
			for(int y=0; y<arrat[x].length; y++) {
					System.out.println("arrat["+x+"]["+y+"]="
							+arrat[x][y]);
					sum += arrat[x][y];
					count++;	// array배열에 선언된 데이터 갯수	
			}
		}
		avg = (double)sum / count;
		// avg = (double) sum / array[x-1].length  // error
		
		System.out.println("sum: " + sum);
		System.out.println("data count : " + count);
		System.out.println("avg: " + avg);
	}
}
