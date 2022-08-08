package beans.demo;

import beans.simple.*;

public class BeanClassKScopes {
	public void display() {
		System.out.println("***************Bean Scope Demo***************");
		System.out.println("BeanClassKScopes display()");
		System.out.println("this.hashCode() : " + this.hashCode());
	}
}
