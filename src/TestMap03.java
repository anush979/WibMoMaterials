import java.util.*;
public class TestMap03 {
	public static void main(String[] args) {
		//HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		//LinkedHashMap<Integer, String> hm1 = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> hm1 = new TreeMap<Integer, String>();
		hm1.put(1, "ONE");
		hm1.put(2, "TWO");
		hm1.put(3, "THREE");
		hm1.put(4, "FOUR");
		hm1.put(5, "FIVE");
		hm1.put(6, "SIX");
		hm1.put(7, "SEVEN");
		hm1.put(8, "EIGHT");
		hm1.put(9, "NINE");
		hm1.put(10, null);
		//hm1.put(null, "TEN");

		System.out.println(hm1);

	}
}
