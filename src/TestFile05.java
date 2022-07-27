import java.io.*;
public class TestFile05 {
	public static void main(String[] args) {
		File rootDrives[] = File.listRoots();
		for(File f : rootDrives) {
			System.out.println(f.getPath());
		}
	}
}
