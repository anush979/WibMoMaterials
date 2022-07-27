public class TestMain09 {
	public static void main(String[] args) {
		Parent0901 p1;
		Parent0902 p2;

		//p1 = new Parent0901();
		Child09 c1 = new Child09();
		c1.test11();
		c1.test22();
		c1.test33();
		
		p1 = c1;
		p1.test11();
		//p1.test22();
		p1.test33();

		p2 = c1;
		//p2.test11();
		p2.test22();
		p2.test33();

	}
}

interface Parent0901{
	static final int i = 10;
	public abstract void test11();
	public abstract void test33();
}
interface Parent0902{
	public abstract void test22();
	public abstract void test33();
}
interface Child0901 extends Parent0901{}
class Child09 implements Parent0901, Parent0902{
	public void test11() {
		System.out.println("Child09 test11()");
	}
	public void test22() {
		System.out.println("Child09 test22()");
	}
	public void test33() {
		System.out.println("Child09 test33()");
	}
}


class TestChild09{
//	void test01() {}
//	String test01() {}
}





