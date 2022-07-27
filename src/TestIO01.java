import java.io.*;
public class TestIO01 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("D:\\eclipse\\workspace\\RoughWorkSpace\\TestProject01\\src\\TestIO01.java");
		System.out.println("fis.markSupported() : " + fis.markSupported());
		System.out.println("fis.available()     : " + fis.available());
//		int b;
//		while(fis.available() > 0)  {
//			b = fis.read();
//			System.out.print((char)b);
//		}	

		int b = fis.read();
		while(b != -1)  {
			System.out.print((char)b);
			fis.skip(5);
			b = fis.read();
		}	
		System.out.println("\nfis.available()     : " + fis.available());
		fis.close();
	}
}