import java.io.*;
public class TestIO02 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("D:\\eclipse\\workspace\\RoughWorkSpace\\TestProject01\\src\\TestIO02.java");
		byte bArray[] = new byte[25];
		
		int bytesRead = fis.read(bArray, 10, 10);
		System.out.println("fis.read(bArray) : " + bytesRead);

		while(bytesRead > 0) {
			for(int i = 0; i < bytesRead; i++) {
				System.out.print((char)bArray[i + 10]);
			}
			bytesRead = fis.read(bArray, 10, 10);
		}
		fis.close();
	}
}
