package sec04.exam;

import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름:");
		String strNum1 = scanner.nextLine();
		
		System.out.print("주민번호 앞 6자리:");
		String strNum2 = scanner.nextLine();
		
		System.out.print("전화번호:");
		String strNum3 = scanner.nextLine();
		
		/*
		 * int num1 = Integer.parseInt(strNum1); int num2 = Integer.parseInt(strNum2);
		 * int num3 = Integer.parseInt(strNum3);
		 */
		
		System.out.println("[입력한 내용]");
		System.out.println("이름: " + strNum1);
		System.out.println("주민번호 앞 6자리: " + strNum2);
		System.out.println("전화번호: " + strNum3);
		// System.out.printf("%s: %-6s", strNum2, strNum3);
	}
}
