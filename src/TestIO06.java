import java.io.*;
public class TestIO06 {
	public static void main(String[] args) throws Exception{
		byte    b = 11;
		short   s = 222;
		int     i = 3333;
		long    l = 44444l;
		float   f = 555555.555f;
		double  d = 6666666.6666;
		char    c = 'A';
		boolean bn = true;
		
		FileOutputStream fos = new FileOutputStream("d://javawork/DataFile.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeByte(b);
		dos.writeShort(s);
		dos.writeInt(i);
		dos.writeLong(l);
		dos.writeFloat(f);
		dos.writeDouble(d);
		dos.writeChar(c);
		dos.writeBoolean(bn);
		dos.close();
		fos.close();
		System.out.println("Primitive data values writen in to d://javawork/DataFile.txt");
	}
}
