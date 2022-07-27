public class TestLambda01 {
	public static void main(String[] args) {
		MyFunctionalType c1 = new MyImpimentingClass();
		
		MyFunctionalType c2 = new MyFunctionalType() {
			public void testMethod() {
				System.out.println("Anonynmous class testMethod()");
			}
		};
		
		MyFunctionalType c3 = ()-> {
			System.out.println("Lambda-1 testMethod()");
		};
		
		MyFunctionalType c4 = ()-> 	System.out.println("Lambda-2 testMethod()");
		
		c1.testMethod();
		c2.testMethod();
		c3.testMethod();
		c4.testMethod();

	}
}

@FunctionalInterface
interface MyFunctionalType{
	void testMethod();
}

class MyImpimentingClass implements MyFunctionalType{
	public void testMethod() {
		System.out.println("MyImpimentingClass testMethod()");
	}
}