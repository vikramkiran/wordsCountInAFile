import java.sql.Time;
import java.time.*;

class A {
	void show() {
		System.out.println("a");
	}
}
class B extends A{
	//	void show() {
	//		System.out.println("hi");
	//	}
	void display() {
		System.out.println("hiello");
	}
}
public class C extends B{
	public static void main(String[] args) {
		B a=new B();
		a.show();	
		a.display();

		LocalDate myObj = LocalDate.now(); // Create a date object
		System.out.println(myObj);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		Time t=new Time(0);
	}
}	
