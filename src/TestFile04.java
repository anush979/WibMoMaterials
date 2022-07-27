import java.io.*;
public class TestFile04 {
	public static void main(String[] args) {
		File f = new File("D:\\eclipse\\eclipseJune2022");
//		String fileList[] = f.list();
//		for(String fileName : fileList) {
//			System.out.println(fileName);
//		}
		System.out.println("-------------------------------------");
		File fList[] = f.listFiles();
		for(File file : fList) {
			if(file.isDirectory()) {
				System.out.println("D : "+ file.getName());
			} else if(file.isFile()) {
				System.out.println("F : "+ file.getName());
			}
		}
	}
}
