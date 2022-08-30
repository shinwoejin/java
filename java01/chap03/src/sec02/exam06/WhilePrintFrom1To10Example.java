package sec02.exam06;

public class WhilePrintFrom1To10Example {
	public static void main(String[] args) {
		
		int i = 1;	// count 변수 i
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("i반복 횟수는 " + i);
	}
}
