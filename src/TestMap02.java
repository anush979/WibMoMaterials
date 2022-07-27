import java.util.*;
public class TestMap02 {
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

		Set<Integer> ks = hm1.keySet();
		for(int i : ks) {
			//System.out.println(i);
			System.out.println(i + " : " + hm1.get(i));
		}
		
		Collection<String> values =  hm1.values();
		for(String s :values) {
			System.out.println(s);
		}
		
		//Map.Entry<Integer, String>
		Set<Map.Entry<Integer, String>> es = hm1.entrySet();
		for(Map.Entry<Integer, String> me : es) {
			System.out.println(me.getKey() + " : " + me.getValue());
		}
	}
}
