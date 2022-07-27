public class TestMain13 {
	public static void main(String[] args) {
		Child13 c1 = new Child13();
		c1.testMethod();
	}
}
class GrandParent13{
	String str = "GrandParent";
}
class Parent13 extends GrandParent13{
	String str = "PARENT";
	public Parent13(String str) {
		super();
	}
	void test() {
		System.out.println("Parent13 test()");
	}
}
class Child13 extends Parent13{
	String str = "CHILD";
	public Child13() {
		super("");
	}
	void test() {
		System.out.println("Child13 test()");
	}
	void testMethod() {
		String str = "LOCAL";
		System.out.println("str       : " + str);
		System.out.println("this.str  : " + this.str);
		System.out.println("super.str : " + super.str);
		test();
		super.test();
	}
}
