package sec01.exam;

public class exam02 {

	public static void main(String[] args) {
		System.out.println("어떤 혜택을 원하세요?");
		
		char grade = 'A';
		//char grade = 'H';
		//char grade = 'C';
		
		switch(grade) {
		case 'A' : System.out.println("A : VVIP 혜택을 받으실 수 있습니다.");
		case 'B' : System.out.println("B : VIP 혜택을 받으실 수 있습니다."); break;
		case 'C' : System.out.println("C : 우수 회원 혜택을 받으실 수 있습니다.");
		case 'D' : System.out.println("D : 일반 회원 혜택을 받으실 수 있습니다."); break;
		default: 
			System.out.println("비회원은 혜택이 없습니다.");
		}
		System.out.println("감사합니다");
		
	}
}
