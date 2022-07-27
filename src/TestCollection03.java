import java.util.*;
public class TestCollection03 {
	public static void main(String[] args) {
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("WibMo");
		hs1.add("SN TOWERS");
		hs1.add("EAST BLOCK");
		hs1.add("MG ROAD");
		hs1.add("BANGALORE");
		hs1.add("KARNATAKA");
		System.out.println(hs1);

		Iterator<String> it = hs1.iterator();
		String s = "";
		while(it.hasNext()) {
			s = it.next();
			System.out.println(s);
			//it.remove();
		}
		System.out.println(hs1);
		
		System.out.println("-----------------------------------");
		for(String ss : hs1) {
			System.out.println(ss);
		}
		

	}
}
