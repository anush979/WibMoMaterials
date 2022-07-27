public class TestMain27 {
	public static void main(String[] args) throws Exception {
		Address27 a1 = new Address27("BANGALORE", "KARNATAKA");
		Person27 p1 = new Person27("SUGNANA", a1);
		Person27 p2 = (Person27) p1.clone();
		p1.name = "SUGNANA G S";
		System.out.println("p1 : " + p1);
		System.out.println("p2 : " + p2);
		p1.resAddress.city = "PUNE";
		System.out.println("-----------------------------");
		System.out.println("p1 : " + p1);
		System.out.println("p2 : " + p2);
	}
}
class Person27 implements Cloneable{
	public Person27(String name, Address27 resAddress) {
		this.name = name;
		this.resAddress = resAddress;
	}
	String name;
	Address27 resAddress;
//	public Person27 getClone() throws CloneNotSupportedException {
//		return (Person27)clone();
//	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Person27 clonedPersion = (Person27)super.clone();
		clonedPersion.resAddress = (Address27) clonedPersion.resAddress.clone();
		return clonedPersion;
	}
	@Override
	public String toString() {
		return name + " " + resAddress.city + " " + resAddress.state;
	}
}
class Address27 implements Cloneable{
	public Address27(String city, String state) {
		this.city = city;
		this.state = state;
	}
	String city;
	String state;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}