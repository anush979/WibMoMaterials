import java.io.*;
import java.util.*;
public class TestFile03 {
	public static void main(String[] args) {
		File myDir1 = new File("d://javawork//myFolder");
		//System.out.println("myDir1.mkdir()           : " + myDir1.mkdir());
		System.out.println("myDir1.delete()          : " + myDir1.delete());
		System.out.println("myDir1.exists()          : " + myDir1.exists());
		System.out.println("myDir1.isFile()          : " + myDir1.isFile());
		System.out.println("myDir1.isDirectory()     : " + myDir1.isDirectory());
	}
}
