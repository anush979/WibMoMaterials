import java.io.*;
public class TestIO09 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("d://javawork/ObjectFile.txt");
		ObjectInput ois = new ObjectInputStream(fis);
		EmployeeIO08 e1 = (EmployeeIO08)ois.readObject();
		e1.display();
		
		ois.close();
		fis.close();
	}
}
