// 클래스 생성 
package Part5_Class_Object;

public class CarExam {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		
		c1.name = "소방차";
		c1.number = 1203;
		
		c2.name = "경찰차";
		c2.number = 8481;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
		
		System.out.println(c2.name);
		System.out.println(c2.number);
	}

}


