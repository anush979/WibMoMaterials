public class TestThread05 {
	public static void main(String[] args) throws Exception{
		System.out.println("End of Main Application");
		MyRunnableThread05 r1 = new MyRunnableThread05();
		//r1.start();
		Thread t1 = new Thread(r1);
		t1.start();
		for(int i = 1; i <= 10; i++ ) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			Thread.sleep(10);
		}
		System.out.println("End of Main Application");
	}
}
class ParentT05{}
class MyRunnableThread05 extends ParentT05 implements Runnable{
	public void run() {
		try {
			for(int i = 1; i <= 10; i++ ) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
				Thread.sleep(10);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}	
}