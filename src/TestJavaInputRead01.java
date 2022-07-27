import java.io.*;
public class TestJavaInputRead01 {
	public static void main(String[] args) throws Exception{
		System.out.println("Please Enter Some Value");
		//System.in ---> InputStream class i.e byte stream class
		
		//Taking System.in as character stream class by wrapping with InputStreamReader class i.e character stream class
		InputStreamReader isr = new InputStreamReader(System.in);
		//Using BufferdReader class to read input text as input line 
		BufferedReader reader = new BufferedReader(isr);
		String line = reader.readLine();
		System.out.println("User Input : " + line);
		
		System.out.println("Enter a Integer value");
		line = reader.readLine();
		int i = Integer.parseInt(line);
		System.out.println("i   : " + i);
		i++;
		System.out.println("i++ : " + i);
	}
}
//int i;
//scanf("%d, &i)
