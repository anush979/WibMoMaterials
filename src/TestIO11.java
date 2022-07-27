import java.io.*;
public class TestIO11 {
	public static void main(String[] args) throws Exception{
		FileWriter fw = new FileWriter("d://javawork/TestJavaApp.java");
		BufferedWriter writer = new BufferedWriter(fw);
		writer.write("public class TestJavaApp{");
		writer.newLine();
		writer.write("	public static void main(String args[]) {");
		writer.newLine();
		writer.write("		System.out.println(\"Hello.......\");");
		writer.newLine();
		writer.write("	}");
		writer.newLine();
		writer.write("}");
		writer.close();
		fw.close();
		System.out.println("Java applicationis writen to d://javawork/TestJavaApp.java");
	}
}
