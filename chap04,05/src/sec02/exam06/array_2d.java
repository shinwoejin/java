package sec02.exam06;

public class array_2d {

	public static void main(String[] args) {
		int max = 0;
		int[][] javaScores = { {88, 95, 80}, {92, 96, 80} };
		// {88, 95, 80}
		// {92, 96, 81}
		// int[][] javaScores = { {95, 80}, {92, 96, 80} };
		
		for(int x=0; x<javaScores.length; x++) {
			for(int y=0; y<javaScores[x].length; y++) {
				System.out.println("javaScores["+x+"]["+y+"]="
						+javaScores[x][y]);
				max += javaScores[x][y];
			}
			System.out.println("max : " + max);
		}
		//System.out.println("max : " + max);
	}

}
