package pack1;
public class MainClass {
	public    String pub = "PUBLIC";
	private   String pri = "PRIVATE";
	protected String pro = "PROTECTED";
	          String def = "DEFAULT";
	public void testMethod() {
		System.out.println("***************pack1.MainClass***************");
		System.out.println(pub);
		System.out.println(pri);
		System.out.println(pro);
		System.out.println(def);
	}
}
class SubClass01 extends MainClass{
	public void testMethod() {
		System.out.println("***************pack1.SubClass01***************");
		System.out.println(pub);
		//System.out.println(pri);
		System.out.println(pro);
		System.out.println(def);
	}
}
class OtherClass01 {
	public void testMethod() {
		MainClass c = new MainClass();
		System.out.println("***************pack1.OtherClass01***************");
		System.out.println(c.pub);
		//System.out.println(c.pri);
		System.out.println(c.pro);
		System.out.println(c.def);
	}
}