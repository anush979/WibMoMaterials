package demos;

import java.util.*;

public class Test04Generic {
	public static void main(String[] args) {
		TestGeneric01<Child> tg1 = new TestGeneric01<Child>();
		TestGeneric01<GrandChild> tg2 = new TestGeneric01<GrandChild>();
		
		//TestGeneric01<GrandParent> tge = new TestGeneric01<Grandparent>();

		GrandParent gp = new GrandParent();
		Parent p1 = new Parent();
		Child c1 = new Child();
		GrandChild gc1 = new GrandChild();
		
		ArrayList<Parent> parentList = new ArrayList<Parent>();
		parentList.add(p1);
		parentList.add(c1);
		parentList.add(gc1);
		//forEach(Consumer<? super E> action)
		// E -> Parent
		// ? -> Parent or Child or GrandChild
		System.out.println(parentList);
		parentList.forEach((n)->System.out.println(n));
	}
}


class GrandParent{
	public String toString() {		return "GrandParent";}
}
class Parent extends GrandParent{
	public String toString() {		return "Parent";}
}
class Child extends Parent{
	public String toString() {		return "Child";}
}
class GrandChild extends Child{
	public String toString() {		return "GrandChild";}
}


class TestGeneric01<T extends Parent>{
	T t;
}

//class TestGeneric02<T super Parent>{
//	T t;
//}