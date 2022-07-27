public class Test01 {
	public static void main(String[] args) {
		Thread t1 = new Thread(DemoClass01 :: myMethod01);
		t1.start();
	}
}


class DemoClass01 {
	static void myMethod01() {
		System.out.println("DemoClass01 testMethod01()");
	}
}