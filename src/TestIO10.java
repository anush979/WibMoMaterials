import java.io.*;
public class TestIO10 {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("D:\\eclipse\\workspace\\RoughWorkSpace\\TestProject01\\src\\TestIO10.java");
		BufferedReader reader = new BufferedReader(fr);
		String line = reader.readLine();
		while(line != null) {
			System.out.println(line);
			line = reader.readLine(); 
		}
	}
}
