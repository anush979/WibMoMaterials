import java.io.*;
public class TestIO07 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("d://javawork/DataFile.txt");
		DataInputStream dis = new DataInputStream(fis);
		System.out.println("byte     b = " + dis.readByte());
		System.out.println("short    s = " + dis.readShort());
		System.out.println("int      i = " + dis.readInt());
		System.out.println("long     l = " + dis.readLong());
		System.out.println("float    f = " + dis.readFloat());
		System.out.println("double   d = " + dis.readDouble());
		System.out.println("char     c = " + dis.readChar());
		System.out.println("boolean bn = " + dis.readBoolean());
		dis.close();
		fis.close();
	}
}
