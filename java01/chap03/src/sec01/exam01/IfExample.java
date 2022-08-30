package sec01.exam01;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if( score >= 90 ) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if( score < 90 ) 
		// {  //블럭이 없다면
			System.out.println("점수가 90보다 작습니다."); // 여기만 수행
			System.out.println("등급은 B등급입니다.");	   // If문과 무관하게 나옴.
		// }
	}

}
