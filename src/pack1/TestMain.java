package pack1;
import pack2.*;
public class TestMain {
	public static void main(String[] args) {
		MainClass    c = new MainClass();
		SubClass01   s1 = new SubClass01();
		OtherClass01 o1 = new OtherClass01();
		SubClass02   s2 = new SubClass02();
		OtherClass02 o2 = new OtherClass02();
		
		c.testMethod();
		s1.testMethod();
		o1.testMethod();
		s2.testMethod();
		o2.testMethod();	
	}
}
