package MyTest1;

public class MyProgram {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		
		myCar1.a = 100;
		Car myCar2 = myCar1;
		int ans = myCar1.calAdd(0,1);
		System.out.println(ans);
		
	}

}
