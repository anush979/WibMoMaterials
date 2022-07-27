import java.io.*;
import java.util.*;
public class TestFile01 {
	public static void main(String[] args) {
		File testFile01 = new File("D:\\eclipse\\workspace\\RoughWorkSpace\\TestProject01\\src\\TestFile01.java");

		System.out.println("testFile01.exists()          : " + testFile01.exists());
		System.out.println("testFile01.isFile()          : " + testFile01.isFile());
		System.out.println("testFile01.isDirectory()     : " + testFile01.isDirectory());
		System.out.println("testFile01.length()          : " + testFile01.length());
		System.out.println("testFile01.isHidden()        : " + testFile01.isHidden());
		System.out.println("testFile01.canRead()         : " + testFile01.canRead());
		System.out.println("testFile01.canWrite()        : " + testFile01.canWrite());
		System.out.println("testFile01.canExecute()      : " + testFile01.canExecute());
		System.out.println("testFile01.getName()         : " + testFile01.getName());
		System.out.println("testFile01.getAbsolutePath() : " + testFile01.getAbsolutePath());
		System.out.println("testFile01.getParent()       : " + testFile01.getParent());
		System.out.println("testFile01.lastModified()    : " + testFile01.lastModified() + " " + new Date(testFile01.lastModified()));
		
	}
}
//Any File in Linux
//	Owner 	Group 	All
//  R W E	R W E	R W E
//  1 1 1	1 0 1	1 0 0
