public class TestMain08 {
	public static void main(String[] args) {
		Parent08 p1;
		//p1 = new Parent08();
		p1 = new Child08();
	}
}

abstract class Parent08 {
	//abstract void test01() ;
}

class Child08 extends Parent08{
	void test01() {
		System.out.println("Child test01()");
	}
}