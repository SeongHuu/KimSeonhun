/* array는 길이가 100인 배열입니다.
 * for문을 이용해서 array에 1부터 100까지의 자연수를 순서대로 넣어보자.
 */
package Part4_Array;

public class ArrayTestExample2 {

	public static void main(String[] args) {
		
		int[] array = new int[100];
		
		for(int i =0; i < array.length; i++) {
			array[i] = i + 1;
		
			System.out.print(array[i]+" ");
		}
	}

}
 