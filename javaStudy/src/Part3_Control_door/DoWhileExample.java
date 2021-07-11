package Part3_Control_door;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		int value = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			// 반복할 문장들
			value = scan.nextInt();  // nextInt()는 정수값을 입력받아 value에 넣어준다.
			System.out.println("입력받은 값:"+value);
			
		}while(value != 10);
		
		System.out.println("반복문 종료!");
	}

}
