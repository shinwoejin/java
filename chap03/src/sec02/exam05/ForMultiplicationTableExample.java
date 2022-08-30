package sec02.exam05;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// 바깥쪽 for문
		for(int m=1; m<=9; m++) { 
			System.out.println("---- " + m + "단----");
			// 중첩 for문
			for(int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
	}

}
