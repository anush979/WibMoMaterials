import java.util.*;
public class TestCollection02 {
	public static void main(String[] args) {
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("WibMo");
		hs1.add("SN TOWERS");
		hs1.add("EAST BLOCK");
		//hs1.add(9179);
		hs1.add("MG ROAD");
		hs1.add("BANGALORE");
		hs1.add("KARNATAKA");
		System.out.println(hs1);

		Object objArray[] = hs1.toArray();
		String s = "";
		for(int i = 0; i < objArray.length; i++) {
			s = (String)objArray[i];
			System.out.println(s);
		}
		System.out.println("---------------------------");
		
		String strArray[] = new String[hs1.size()];
		hs1.toArray(strArray);
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}
}
