public class TestMain25 {
	public static void main(String[] args) {
		Child26 c1 = new Child26();
		Parent26 p1 = new Parent26() {
			@Override
			public void testMethod01() {
				System.out.println("Anonymous Class of type Parent26 testMethod01()");
			}
			@Override
			public void testMethod02() {
				System.out.println("Anonymous Class of type Parent26 testMethod02()");
			}
		};
		p1.testMethod01();
		p1.testMethod02();
		
		c1.testMethod01();
		c1.testMethod02();
	}
}
@FunctionalInterface
interface Parent25{
	void testMethod01();
//	void testMethod02();
}
interface Parent26{
	void testMethod01();
	void testMethod02();	
}
class Child26 implements Parent26{
	public void testMethod01() {
		System.out.println("Child26 implements Parent26 testMethod01()");
	}
	@Override
	public void testMethod02() {
		System.out.println("Child26 implements Parent26 testMethod02()");
	}
}