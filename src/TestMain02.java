public class TestMain02 {
	public static void main(String[] args) {
		Customer02 c1;
		c1 = new Customer02();
		Customer02 c2 = new Customer02();
//		System.out.println("c1.custId   : " + c1.custId);
//		System.out.println("c1.custName : " + c1.custName);
//		System.out.println("c1.custType : " + c1.custType);
//		System.out.println("-------------------------------------------");
		c1.display();
		
//		c1.custId = "1111";
//		c1.custName = "SUGNANA";
//		c1.custType = "GOLD";
		c1.setCustomer("1111", "SUGNANA", "GOLD");
		
//		c2.custId = "2222";
//		c2.custId = "SRINIVAS";
//		c2.custType = "GOLD";
		c2.setCustomer("2222", "SRINIVAS", "GOLD");
		
//		System.out.println("c1.custId   : " + c1.custId);
//		System.out.println("c1.custName : " + c1.custName);
//		System.out.println("c1.custType : " + c1.custType);
//		System.out.println("-------------------------------------------");
		c1.display();
		c2.display();		
		
		Customer02 c3 = new Customer02();
		c3.setCustomer("3333", "MAHESH");
		c3.display();
	}
}
class Customer02{
	//GlobalVariables or MemberVariables
	String custId;
	String custName;
	String custType;
	void setCustomer(String custId, String custName) {
		this.custId = custId;
		this.custName = custName;
	}	
	//this -> Current Working Object
	void setCustomer(String custId, String custName, String custType) {
		this.custId = custId;
		this.custName = custName;
		this.custType = custType;
	}	
	void display() {
		//LocalVariable
		String str;
		System.out.println("ID   : " + custId);
		System.out.println("NAME : " + custName);
		System.out.println("TYPE : " + custType);
		System.out.println("-------------------------------------------");
	}
	//void setCustomer(String id, String name, String type) {
//	custId = id;
//	custName = name;
//	custType = type;
//}

}



