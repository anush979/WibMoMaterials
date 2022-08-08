package beans.demo;

import beans.simple.*;
import java.util.*;
public class BeanClassQCollectionDemo {
	
	private List<BeanClass> myList;
	private Set<BeanClass> mySet;
	private Map<String, BeanClass> myMap1;
	private Map<BeanClass, String> myMap2;
	private Properties prop1;
	private Properties prop2;

	public List<BeanClass> getMyList() {
		return myList;
	}
	public void setMyList(List<BeanClass> myList) {
		this.myList = myList;
	}
	public Set<BeanClass> getMySet() {
		return mySet;
	}
	public void setMySet(Set<BeanClass> mySet) {
		this.mySet = mySet;
	}
	public Map<String, BeanClass> getMyMap1() {
		return myMap1;
	}
	public void setMyMap1(Map<String, BeanClass> myMap1) {
		this.myMap1 = myMap1;
	}
	public Map<BeanClass, String> getMyMap2() {
		return myMap2;
	}
	public void setMyMap2(Map<BeanClass, String> myMap2) {
		this.myMap2 = myMap2;
	}
	public Properties getProp1() {
		return prop1;
	}
	public void setProp1(Properties prop1) {
		this.prop1 = prop1;
	}
	public Properties getProp2() {
		return prop2;
	}
	public void setProp2(Properties prop2) {
		this.prop2 = prop2;
	}
	public void display() {
		System.out.println("***************Collection Demo***************");
		System.out.println("BeanClassQCollectionDemo display()");
		System.out.println("---------------List Collection---------------");
		for(BeanClass b : myList) {
			b.display();
		}
		System.out.println("---------------Set Collection---------------");
		for(BeanClass b : mySet) {
			b.display();
		}
		System.out.println("---------------Map 1---------------");
		for(Map.Entry<String, BeanClass> b : myMap1.entrySet()) {
			System.out.print(b.getKey() + " : ");
			b.getValue().display();
		}
		System.out.println("---------------Map 2---------------");
		for(Map.Entry<BeanClass, String> b : myMap2.entrySet()) {
			System.out.print("KEY   : ");
			b.getKey().display();
			System.out.println("VALUE : " + b.getValue());
		}
		System.out.println("---------------Properties 1---------------");
		for(Map.Entry<Object, Object> p : prop1.entrySet()) {
			System.out.println(p.getKey() + " : " + p.getValue());
		}
		System.out.println("---------------Properties 2---------------");
		for(Map.Entry<Object, Object> p : prop2.entrySet()) {
			System.out.println(p.getKey() + " : " + p.getValue());
		}
	}
}