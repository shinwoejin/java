package sec01.exam;

public class exam01 {

	public static void main(String[] args) {
		//int score = 85;
		int score = 70;
		System.out.println("등급은 ");
		if(score < 70) {
			System.out.println("D");
		} else if(score < 80) {
			System.out.println("C");
		} else if(score < 90) {
			System.out.println("B");
		} else {
			System.out.println("A");
		}
		System.out.println("입니다.");
	}

}
