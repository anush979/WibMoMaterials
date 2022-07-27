import java.util.*;
public class TestJavaInputRead02 {
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter some value");
		String line = scanner.nextLine();
		System.out.println("USER INPUT : " + line);
		
		System.out.println("Enter a Integer Value");
		int i = 0;
		
		if(scanner.hasNextInt()) {
			i = scanner.nextInt();
		}
		System.out.println("i   : " + i);
		i++;
		System.out.println("i++ : " + i);
		
	}
}
