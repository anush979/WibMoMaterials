public class TestMain24 {
	public static void main(String[] args) {
		Child24 c1 = new Child24();
		c1.testMethod03();
		
		Parent2401.testMethodStatic();
	}
}
interface Parent2401{
	void testMethod01();
	void testMethod02();
	default void testMethod03() {
		System.out.println("interface Parent2401 testMethod03()");
	}	
	static void testMethodStatic() {
		System.out.println("interface Parent2401 testMethodStatic()");
	}
}
class Child24 implements Parent2401{
	@Override
	public void testMethod01() {
	}
	@Override
	public void testMethod02() {
	}
}














interface Parent2402{
	default void testMethod03() {
		System.out.println("interface Parent2402 testMethod03()");
	}	
	void testMethod04();
	void testMethod05();
}
