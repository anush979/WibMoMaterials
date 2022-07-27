import java.io.*;
public class TestIO04 {
	public static void main(String[] args) throws Exception{
		byte bArray1[] = new byte[100];
		byte bArray2[] = new byte[100];
		byte bArray3[] = new byte[100];

		
		for(int i = 0; i < bArray1.length; i++) {
			//bArray[i]
		}
		
		int i1 = 0;
		int i2 = 0;
		int i3 = 0;
				
		//int r = bArray1[i1++] + bArray2[i2++] + bArray3[i3++] + (3 * bArray1[i1++]) + (5 * bArray2[i1++]) + (6 *bArray3[i3++]);
		
		ByteArrayInputStream bis1 = new ByteArrayInputStream(bArray1);
		ByteArrayInputStream bis2 = new ByteArrayInputStream(bArray2);
		ByteArrayInputStream bis3 = new ByteArrayInputStream(bArray3);

		int r = bis1.read() + bis2.read() + bis3.read() + (3 * bis1.read()) + (5 * bis2.read()) + (6 * bis3.read());

	}
}
