// String 클래스
package Part5_Class_Object;

public class StringExample1 {

	public static void main(String[] args) {
		
		String str1 = "hello";
		String str2 = "hello";
		
		String str3 = new String("hello");  // 새로운 인스턴스를 hip영역에 저장
		String str4 = new String("hello");
		
		if(str1 == str2)
			System.out.println("str1 str2는 같은 래퍼런스 입니다.");
		
		if(str1 == str3)
			System.out.println("str3와 str4는 같은 래퍼런스 입니다.");
		
		if(str3 == str4)
			System.out.println("str3와 str4는 같은 래퍼런스 입니다.");
		
	}

}
