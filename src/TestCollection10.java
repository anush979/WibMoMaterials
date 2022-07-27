import java.util.*;
public class TestCollection10 {
	public static void main(String[] args) {
		ArrayList<String> arL1 = new ArrayList<String>();
		arL1.add("WibMo");
		arL1.add("SN-TOWERS");
		arL1.add("EAST-BLOCK");
		arL1.add("MG-ROAD");
		arL1.add("BANGALORE");
		arL1.add("KARNATAKA");
		System.out.println(arL1);
		System.out.println("arL1.add(BANGALORE) : " + arL1.add("BANGALORE"));
		System.out.println(arL1);
		System.out.println("arL1.add(BANGALORE) : " + arL1.add("BANGALORE"));
		System.out.println(arL1);
		System.out.println("arL1.add(BANGALORE) : " + arL1.add("BANGALORE"));
		System.out.println(arL1);
		System.out.println("arL1.add(BANGALORE) : " + arL1.add("BANGALORE"));
		System.out.println(arL1);
		System.out.println("arL1.get(6) : " + arL1.get(3));
		System.out.println("arL1.remove(2): " + arL1.remove(2));		//Random Delete Operation
		System.out.println(arL1);
		arL1.set(5, "BENGALOORU");										//Update Operation
		System.out.println(arL1);
		arL1.add(5, "INDIA");											//Random Insert Operation
		System.out.println(arL1);
		
		System.out.println("arL1.indexOf(BANGALORE)     : " + arL1.indexOf("BANGALORE"));
		System.out.println("arL1.lastIndexOf(BANGALORE) : " + arL1.lastIndexOf("BANGALORE"));
		
		List<String> subList = arL1.subList(3, 7);
		System.out.println(subList);
		
		
		

	}
}
