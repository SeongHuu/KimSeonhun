package Part5_Class_Object;

public class MethodTestExample {

	public static void main(String[] args) {
		
		Method_Declaration myclass = new Method_Declaration();
		myclass.method1();
		myclass.method2(10);
		int value = myclass.method3();
		System.out.println("m3이 리턴한 값 "+ value);
		myclass.method4(5, 10);
		int value2 = myclass.method5(55);
		System.out.println("m5가 리턴한 값: " + value2);
		
		
	}

}
