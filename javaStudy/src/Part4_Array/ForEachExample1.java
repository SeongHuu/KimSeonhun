// ForEach 실습
package Part4_Array;

public class ForEachExample1 {

	public static void main(String[] args) {
		
		int [] iarray = {10,20,30,40,50};
		
		for(int i = 0; i < iarray.length; i++) {
			int value = iarray[i];
			System.out.println(value);
		}
		
		
		for(int value: iarray) {
			System.out.println(value);
		}

	}

}
