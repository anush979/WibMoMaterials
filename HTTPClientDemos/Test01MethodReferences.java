package demos;

public class Test01MethodReferences {
	public static void main(String[] args) {
		System.out.println("********************Static Method Reference**********************************");
		DemoInterface01 dem01 = DemoClass01::myStaticMethod01;
		dem01.testMethod();

		System.out.println("********************Method Reference**********************************");
		DemoClass01 dc02 = new DemoClass01();
		DemoInterface01 dem02 = dc02::myMethod02;
		dem02.testMethod();
		
		System.out.println("********************Constructor Reference**********************************");
		DemoInterface01 dem03 = DemoClass01::new;
		dem03.testMethod();
	}
}
@FunctionalInterface
interface DemoInterface01{
	public void testMethod();
}

class DemoClass01{
	public DemoClass01() {
		System.out.println("DemoClass01()");
	}
	
	public static void myStaticMethod01() {
		System.out.println("DemoClass01 public static void myStaticMethod01()");
	}
	
	public void myMethod02() {
		System.out.println("DemoClass01 public void myMethod02()");
	}

}
