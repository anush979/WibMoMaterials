public class TestMain12 {
	public static void main(String[] args) {
		Parent12 p1 = new Parent12();
		System.out.println("p1.i : " + p1.i);
		//p1.i = 20;
		System.out.println("p1.i : " + p1.i);

		Parent12 p2 = new Parent12(100);
		System.out.println("p2.i : " + p2.i);
	}
}
final class Parent12{
	//final int i = 10;
	final int i;
	public Parent12() {
		i = 10;
	}
	public Parent12(int i) {
		this.i = i;
	}
	final void testMethod() {
		System.out.println("Parent12 testMethod()");
	}
}
class Child12{
//class Child12 extends Parent12{
//	void testMethod() {
//		System.out.println("Child12 testMethod()");
//	}
}