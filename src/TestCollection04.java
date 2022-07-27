import java.util.*;
public class TestCollection04 {
	public static void main(String[] args) {
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("WibMo");
		hs1.add("SN TOWERS");
		hs1.add("EAST BLOCK");
		hs1.add("MG ROAD");
		hs1.add("BANGALORE");
		hs1.add("KARNATAKA");
		System.out.println(hs1);

		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("JAVA");
		hs2.add("SPRING");
		hs2.add("HIBERNATE");
		hs2.add("JEE");
		hs2.add("REST");
		hs2.add("SQL");
		System.out.println(hs2);
		
		hs1.addAll(hs2);
		System.out.println(hs1);
		
		System.out.println("hs1.containsAll(h2) : " + hs1.containsAll(hs2));
		hs1.remove("JAVA");
		System.out.println("hs1.containsAll(h2) : " + hs1.containsAll(hs2));
		//hs1.removeAll(hs2);
		hs1.retainAll(hs2);
		System.out.println(hs1);
		

	}
}
