
public class TestMain16 {
	public static void main(String[] args) {
		TestClass16 c1 = new TestClass16();
		//c1.testMethod();
		c1.hashCode();
		c1.equals("");
		c1.toString();
		
		Object obj1;
		obj1 = c1;
		obj1 = new TestClazz16();
	}
	
}

class TestClass16 extends Object{}
class TestClazz16{}
// toString()
// equals()
// hashCode()
// finalize()
// wait()		Thread Communication
// notify()		Thread Communication
// clone()		