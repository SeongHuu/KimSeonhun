/* 메소드
 * 입력값 : 매개변수,인자       
 * 매개변수 -> 전달된 인자를 받아들이는 변수를 의미한다.
 * 인자 -> 어떤 함수를 호출시에 전달되는 값을 의미한다.
 * 결과값 : 리턴값
 */
package Part5_Class_Object;

public class Method_Declaration {

//	public 리턴타입 메소드명(매개변수 등) {  구현  }
//  return type이 없는경우 void 예약어 사용
//	매개변수도 없고 리턴타입도 없는경우 메소드 정의
	public void method1() {
		System.out.println("m1이 실행됨...");
	}
	
//	정수를 매개변수로 받아들여서 뭔가를 수행하고 리턴을 하지않는 메서드 
	public void method2(int x) {
		System.out.println(x + "을 이용한 m2실행");
	}
	
//	아무것도 받아들여지지 않았지만 뭔가를 수행해서 값을 돌려주는 메서드
	public int method3() {
		System.out.println("m3 실행");
		return 10;
	}
	
//	정수값을 두개 받아들이고 return은 하지 않는 메서드
	public void method4(int x, int y) {
		System.out.println(x + y +"method4 실행");
	}
	
//  값을 받아서 값을 출력하는 형태 
	public int method5(int y) {
		System.out.println(y + "이용한 m5 실행");
		return y*2;
	}
}
