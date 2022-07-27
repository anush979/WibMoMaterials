import java.util.*;
public class TestCollection06 {
	public static void main(String[] args) {
		TreeSet<String> ts1 = new TreeSet<String>();
		ts1.add("WibMo");
		ts1.add("SN-TOWERS");
		ts1.add("EAST-BLOCK");
		ts1.add("MG-ROAD");
		ts1.add("BANGALORE");
		ts1.add("KARNATAKA");
		System.out.println(ts1);
		System.out.println("ts1.first() : " +  ts1.first());
		System.out.println("ts1.last()  : " +  ts1.last());
		
		
		SortedSet<String> head = ts1.headSet("MG-ROAD");
		System.out.println(head);
		
		SortedSet<String> tail = ts1.tailSet("MG-ROAD");
		System.out.println(tail);

		
		SortedSet<String> subset = ts1.subSet("EAST-BLOCK", "SN-TOWERS");
		System.out.println(subset);
		//////////////////////////////////NavaigableSet/////////////////////////////////////////////
		System.out.println("ts1.ceiling(N) : " + ts1.ceiling("N"));
		System.out.println("ts1.floor(N)   : " + ts1.floor("N"));

		System.out.println("ts1.higher(MG-ROAD) : " + ts1.higher("MG-ROAD"));
		System.out.println("ts1.lower(MG-ROAD)  : " + ts1.lower("MG-ROAD"));
		
		System.out.println("ts1.pollFirst() : " + ts1.pollFirst());
		System.out.println("ts1.polllast()  : " + ts1.pollLast());
	}
}

//MG-ROAD
//N
//SN-TOWERS

