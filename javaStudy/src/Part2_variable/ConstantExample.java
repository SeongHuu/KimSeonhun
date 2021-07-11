// 상수 배우기
// 상수는 한번 저장한 데이터값을 변경 할 수 없다.
// 상수를 사용할때는 앞에 final을 붙여준다.
// 상수는 모두 대문자로만 구성된 명사를 사용한다.
package Part2_variable;

public class ConstantExample {

	public static void main(String[] args) {
		int i;
		i=10;
		i=20;
		
		final int J;
		J=10;
//		J=20;
		
//		원의 넓이 구해보기
		double circleArea;
		final double PI=3.14159;
		circleArea = 3*3*PI;
		
		final int OIL_PRICE=1450;
		int totalPrice = 50*OIL_PRICE;
		

	}

}
