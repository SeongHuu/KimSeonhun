/* while문을 사용해 1~10까지 숫자를 출력하는 코드이다.
 * if문을 추가해서 i가 짝수일 때만 i를 출력하게 코드를 바꿔보자.
 */
package Part3_Control_door;

public class WhileExample2 {
	
	public static void main(String[] args) {
		
		int i=1;
		while(i<11) {
			if(i % 2 == 0)
				System.out.println(i);
			i++;
		}
	}

}
