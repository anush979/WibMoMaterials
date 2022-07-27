import java.io.FileInputStream;
public class TestMain19 {
	public static void main(String[] args) throws Exception{
		System.out.println("START of Application");
		TestApplication19 ta1 = new TestApplication19();
		ta1.testMethod();
		ta1 = null;
		
		System.gc();
		Thread.sleep(1000);
		
		System.out.println("END of Application");
	}
}

class TestApplication19{
	FileInputStream fis;
	void testMethod() throws Exception{
		fis = new FileInputStream("D:\\eclipse\\workspace\\RoughWorkSpace\\TestProject01\\src\\TestMain19.java");
		//
		//
		//
	}
	
	@Override
	protected void finalize() throws Throwable {
		fis.close();
		System.out.println("TestApplication19 finalize()..... doing cleanup task");
	}
}
