import java.io.*;
public class TestException02 {
	public static void main(String[] args) throws IOException, ArithmeticException {
		DemoApplicationE02 a1 = new DemoApplicationE02();
		a1.testMethod01();
	}
}
class DemoApplicationE02 {
	public void testMethod01() throws FileNotFoundException, IOException, ArithmeticException{
		System.out.println("START");
		int a = 10;
		int b = 0;
		int c = 2;
		int r = 0;
		FileInputStream fis = null;
		fis = new FileInputStream("D:\\javawork\\MyClass.java");
		r = a / b;
		r = a / c;
		fis.close();
		
		System.out.println("RESULT : " + r);
		System.out.println("END");
	}
}