import java.io.*;
import java.util.*;
public class TestProperties01 {
	public static void main(String[] args) throws Exception{
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream("D:\\eclipse\\workspace\\RoughWorkSpace\\TestProject01\\src\\demo.properties");
		properties.load(fis);
		System.out.println("ID   : " + properties.getProperty("id"));
		System.out.println("NAME : " + properties.getProperty("name"));
		System.out.println("DEPT : " + properties.getProperty("dept"));
		System.out.println("DESG : " + properties.getProperty("desg"));
		fis.close();
	}
}
