package sec02.exam;

public class exam05 {
	public static void main(String[] args) {
		/*for (int i = 4; i > 0; i--) {
			for(int j=1; j<5; j++) {
				if(i < j) {
					System.out.print(" ");
					
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}*/
		
		for (int i = 1; i < 5; i++) {
			for(int j=4; j>0; j--) {
				if(i < j) {
					System.out.print(" ");
					System.out.print("i < j |" + i + " | " + j);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
