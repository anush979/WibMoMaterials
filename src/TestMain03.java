public class TestMain03 {
	public static void main(String[] args) {
		Customer03 c1 = new Customer03();
		Customer03 c2 = new Customer03();
		Customer03 c3 = new Customer03();
		Customer03 c5 = new Customer03("5555", "AJITH", "SILVER");
		c1.display();
		c1.setCustomer("1111", "SUGNANA", "GOLD");		
		c2.setCustomer("2222", "SRINIVAS", "GOLD");
		c3.setCustomer("3333", "MAHESH");
		c1.display();
		c2.display();	
		c3.display();
		c5.display();
		Customer03 c4 = null;
		//c4.display();		
		c4 = c1;
		c4.display();
		c4 = c2;
		c4.display();
		c1 = c2;
		c1.display();
	}
}
class Customer03{
	String custId;
	String custName;
	String custType;
	public Customer03() {
		super();
	}
	public Customer03(String custId, String custName, String custType) {
		this.custId = custId;
		this.custName = custName;
		this.custType = custType;
	}	
	void setCustomer(String custId, String custName) {
		this.custId = custId;
		this.custName = custName;
	}	
	void setCustomer(String custId, String custName, String custType) {
		this.custId = custId;
		this.custName = custName;
		this.custType = custType;
	}	
	void display() {
		System.out.println("ID   : " + custId);
		System.out.println("NAME : " + custName);
		System.out.println("TYPE : " + custType);
		System.out.println("-------------------------------------------");
	}
}

