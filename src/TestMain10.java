public class TestMain10 {
	public static void main(String[] args) {
		Parent10 p1 = new Parent10();
		Parent10 p2 = new Parent10();
		Parent10 p3 = new Parent10();
		Parent10 p4 = null;
		
		p1.i = 10;
		p2.i = 20;
		p3.i = 30;
		p4.i = 40;
		Parent10.i = 50;
		System.out.println("p1.i = " + p1.i);
		System.out.println("p2.i = " + p2.i);
		System.out.println("p3.i = " + p3.i);
		System.out.println("p4.i = " + p4.i);
		System.out.println("Parent10.i = " + Parent10.i);

		Parent10.testStatic();
		//Parent10.testMethod();
		p1.testMethod();
		p4.testMethod();
	}
}

class Parent10{
						//Member variables
	static int i;		//Class    Variable //Static    variables are ClassVariables
	int j;				//Instance Variable //NonStatic variables are InstanceVariables
	
	static void testStatic() {
		System.out.println("Parent10 testStatic() i " + i);
		//System.out.println("Parent10 testStatic() j " + j);
		//testMethod();
	}
	
	void testMethod() {
		System.out.println("Parent10 testMethod() i " + i);		
		System.out.println("Parent10 testMethod() j " + j);
		testStatic();
	}
}