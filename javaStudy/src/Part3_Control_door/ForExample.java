package Part3_Control_door;

public class ForExample {

	public static void main(String[] args) {
		
		// 1부터 100까지의 합
		int total = 0;
		
		for(int i = 1; i<=100; i++) {  // 초기화 조건식 증감식
			total = total + i;
		}
		
		System.out.println(total);

		
		
		// 1부터 100까지의 수 중 짝수의 합
        int total1 = 0;
		
		for(int i = 1; i<=100; i++) {  // 초기화 조건식 증감식
			if(i % 2 != 0) {
				continue;
			}
			total1 = total1 + i;
		}
		
		System.out.println(total1);
		
		
		
		// 1부터 50까지의 합
        int total2 = 0;
		
		for(int i = 1; i<=100; i++) {  // 초기화 조건식 증감식
			total2 = total2 + i;
			if(i == 50) {
				break;
			}
		}
		
		System.out.println(total2);
	}

}
