import java.io.*;
import java.util.*;
public class TestFile02 {
	public static void main(String[] args) throws Exception{
		File f1 = new File("d://javawork/TestFile.txt");
		//System.out.println("f1.createNewFile()   : " + f1.createNewFile());
		//System.out.println("f1.delete()          : " + f1.delete());
		System.out.println("f1.exists()          : " + f1.exists());
		System.out.println("f1.isFile()          : " + f1.isFile());
		System.out.println("f1.isDirectory()     : " + f1.isDirectory());
		System.out.println("f1.length()          : " + f1.length());
		System.out.println("f1.isHidden()        : " + f1.isHidden());
		System.out.println("f1.canRead()         : " + f1.canRead());
		System.out.println("f1.canWrite()        : " + f1.canWrite());
		System.out.println("f1.canExecute()      : " + f1.canExecute());
		System.out.println("f1.getName()         : " + f1.getName());
		System.out.println("f1.getAbsolutePath() : " + f1.getAbsolutePath());
		System.out.println("f1.getParent()       : " + f1.getParent());
	}
}
