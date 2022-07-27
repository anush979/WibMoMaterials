import java.io.*;
public class TestException01 {
	public static void main(String[] args) {
		System.out.println("START of Application");
		int a = 10;
		int b = 0;
		int c = 2;
		int r = 0;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\javawork\\MyClsssass.java");
			r = a / b;
			r = a / c;
			//
			//
			//
			//
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(ArithmeticException e) {
			if(b == 0) {
				
			} else if( c == 0) {
				
			}
			e.printStackTrace();
			String message = e.getMessage();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null)
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		
		System.out.println("RESULT : " + r);
		System.out.println("END   of Application");
	}
}
