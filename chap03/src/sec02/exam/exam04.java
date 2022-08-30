package sec02.exam;

public class exam04 {

	public static void main(String[] args) {
		for(int i=1; i<5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				//System.out.print("i=" + i + " j=" + j + "|");
				if(j == i) {
					//System.out.println(" j==i : " + j);
					System.out.println();
				}
			}
		}
	}
}
