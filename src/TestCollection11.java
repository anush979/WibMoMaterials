import java.util.*;
public class TestCollection11 {
	public static void main(String[] args) {
		LinkedList<String> lL1 = new LinkedList<String>();
		lL1.add("WibMo");
		lL1.add("SN-TOWERS");
		lL1.add("EAST-BLOCK");
		lL1.add("MG-ROAD");
		lL1.add("BANGALORE");
		lL1.add("KARNATAKA");
		System.out.println(lL1);
		System.out.println(lL1.offer("JAVA"));
		System.out.println(lL1);
		System.out.println("lL1.peek(): " + lL1.peek());
		System.out.println(lL1);
		System.out.println("lL1.poll(): " + lL1.poll());
		System.out.println(lL1);

		
		System.out.println(lL1.offerLast("SPRING"));
		System.out.println(lL1);
		System.out.println("lL1.peekFirst(): " + lL1.peekFirst());
		System.out.println(lL1);
		System.out.println("lL1.pollFirst(): " + lL1.pollFirst());
		System.out.println(lL1);

		
		System.out.println(lL1.offerFirst("HIBERNATE"));
		System.out.println(lL1);
		System.out.println("lL1.peekLast(): " + lL1.peekLast());
		System.out.println(lL1);
		System.out.println("lL1.pollLast(): " + lL1.pollLast());
		System.out.println(lL1);

	}
}
