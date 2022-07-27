import java.io.*;
public class TestIO03 {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("d://javawork/TestFile.txt", true);
		for(int b = 65; b < 91; b++) {
			fos.write(b);
		}
		
		fos.flush();
		System.out.println("Text data written to file d://javawork/TestFile.txt");
		fos.close();
	}
}
