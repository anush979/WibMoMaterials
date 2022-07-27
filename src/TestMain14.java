public class TestMain14 {
	public static void main(String[] args) throws Exception{
		Class.forName("Parent14");
//		Child14 c1 = new Child14();
//		Child14 c2 = new Child14();
//		Child14 c3 = new Child14();
//		
//		Parent14 p1 = new Parent14();
//		Parent14 p2 = new Parent14();
//		Parent14 p3 = new Parent14();
	}
}
class Parent14{
	static {
		System.out.println("Parent14 Static Anonymous Block-1");
	}
	{
		System.out.println("Parent14 Anonymous Block-1");
	}
	public Parent14() {
		System.out.println("Parent14()");
	}
}
class Child14 extends Parent14{
	static {
		System.out.println("Child14 Static Anonymous Block-1");
	}
	{
		System.out.println("Child14 Anonymous Block-1");
	}
	public Child14() {
		System.out.println("Child14()");
	}
}