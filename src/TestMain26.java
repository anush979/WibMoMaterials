public class TestMain26 {
	public static void main(String[] args) {
		Parent2601 p1 = new Child2601();
		Parent2601 p2 = new Parent2601() {
			public void testMethod01() {
				System.out.println("Anonymous class implements Parent2601 testMthod01()");
			}	
		};
		//Lambda Expression code
		Parent2601 p3 = ()-> {
			System.out.println("Lambda Implementation-1 of Parent2601 testMthod01()");
		};

		//Lambda Expression code
		Parent2601 p4 = ()-> System.out.println("Lambda Implementation-2 of Parent2601 testMthod01()");
		p1.testMethod01();
		p2.testMethod01();
		p3.testMethod01();
		p4.testMethod01();
	}
}
@FunctionalInterface
interface Parent2601{
	void testMethod01();
}
class Child2601 implements Parent2601{
	@Override
	public void testMethod01() {
		System.out.println("Child2601 implements Parent2601 testMthod01()");
	}	
}