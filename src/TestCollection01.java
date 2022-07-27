import java.util.*;
public class TestCollection01 {
	public static void main(String[] args) {
		HashSet hs1 = new HashSet();
		hs1.add("WibMo");
		hs1.add("SN TOWERS");
		hs1.add("EAST BLOCK");
		hs1.add("MG ROAD");
		hs1.add("BANGALORE");
		hs1.add("KARNATAKA");
		System.out.println(hs1);
		hs1.add("BANGALORE");
		System.out.println("hs1.add(BANGALORE) : " + hs1.add("BANGALORE"));
		System.out.println(hs1);
		
		System.out.println("hs1.size() : " + hs1.size());
		hs1.remove("MG ROAD");
		System.out.println(hs1);
		System.out.println("hs1.contains(WibMo)   : " + hs1.contains("WibMo"));
		System.out.println("hs1.contains(MG ROAD) : " + hs1.contains("MG ROAD"));
		System.out.println("hs1.isEmpty() : " + hs1.isEmpty());
		hs1.clear();
		System.out.println(hs1);
		System.out.println("hs1.isEmpty() : " + hs1.isEmpty());

	}
}
