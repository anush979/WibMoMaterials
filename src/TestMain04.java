public class TestMain04 {
	public static void main(String[] args) {
		Parent04 p1 = new Parent04();
		Child04 c1 = new Child04();
		
		p1.i = 10;
		c1.j = 20;
		
		//p1.j = 11;
		c1.i = 21;
	}
}

class Parent04{
	int i;
	//
	//
	//
}

class Child04 extends Parent04{
	int j;
}