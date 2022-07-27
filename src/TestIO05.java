import java.io.*;
public class TestIO05 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("D:\\eclipse\\workspace\\RoughWorkSpace\\TestProject01\\src\\TestIO05.java");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		bis.read();
		
		FileOutputStream fos = new FileOutputStream("d://javawork/TestrFile.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write(65);
	}
}
