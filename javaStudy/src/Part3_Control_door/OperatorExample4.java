// 논리 연산자

/* 논리곱 A && B
 * A or B 둘다 TRUE일때만 TRUE출력. 하나라도 FALSE이거나 둘다 FALSE일경우 FALSE 출력
 * 
 * 논리합 A || B
 * A or B 둘다 TRUE 이거나 하나라도 TRUE인 경우 TRUE 출력. A,B 둘다 FALSE인경우 FALSE출력
 * 
 * 논리부정 !A , !B
 * A가 TRUE이면 FALSE출력. FALSE이면 TRUE출력
 * 
 * 베타적 논리합 A ^ B
 * A or B가 둘다 TRUE이거나 FALSE인경우 FALSE 출력. 피연산자 A or B가 하나씩 다른경우는 TRUE출력
 */
package Part3_Control_door;

public class OperatorExample4 {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true ;
		
		// 논리곱
		System.out.println(b1 && b2);
		System.out.println(b1 && b3);
		
		// 논리합
		System.out.println(b1 || b2);
		System.out.println(b1 || b3);
		System.out.println(b2 || b2);
		
		// 100보다는 작고 70보다는 큰 수중에 변수값 88이 존재하면 성공, 없으면 실패 출
		int score = 88;
		if(score <=100 && score >=70) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		// 베타적 논리합 
		System.out.println(b1 ^ b3);
		System.out.println(b1 ^ b2);
		
		// 논리부정
		System.out.println(!b1);
		
		
	}

}
