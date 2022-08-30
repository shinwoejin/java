package sec02.exam;

public class exam04 {

	public static void main(String[] args) {
		// for문을 이용해서 주어진 배열의 항복에서 최대값을 구해보세요.
		/*
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) { // 0 < 1, 1 < 5, 5 > 3, 5 < 8, 8 > 2, max = 8
				max = array[i];	// max = 1, max = 5, max =8 
				System.out.println("sub " + max);
			}
		}
		
		System.out.println("max: " + max);*/
		
		int max = 0;
		int[] array = {9, 5, 3, 8, 2};
		
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) { 
				max = array[i];	
				System.out.println("sub " + max);
			}
		}
		
		System.out.println("max: " + max);
	}

}
