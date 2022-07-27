import java.util.*;
public class TestMap01 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(1, "ONE");
		hm1.put(2, "TWO");
		hm1.put(3, "THREE");
		hm1.put(4, "FOUR");
		hm1.put(5, "FIVE");
		hm1.put(6, "SIX");
		hm1.put(7, "SEVEN");
		hm1.put(8, "EIGHT");
		hm1.put(9, "NINE");
		System.out.println(hm1);
		hm1.put(1, "ONEEEEEEEEEEEEEE");
		System.out.println("hm1.size() : " + hm1.size());
		System.out.println(hm1);
		hm1.put(3, "TWO");
		System.out.println(hm1);
		
		System.out.println("hm1.containsKey(9)      : " + hm1.containsKey(9));
		System.out.println("hm1.containsValue(NINE) : " + hm1.containsValue("NINE"));
		hm1.remove(1);
		System.out.println(hm1);
		System.out.println("hm1.get(7) : " + hm1.get(7));
		System.out.println("hm1.isEmpty() : " + hm1.isEmpty());
		hm1.clear();
		System.out.println("hm1.isEmpty() : " + hm1.isEmpty());
		System.out.println(hm1);

	}
}
