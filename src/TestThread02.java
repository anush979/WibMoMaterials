public class TestThread02 {
	public static void main(String[] args) throws Exception{
		System.out.println("Start of Main Application");

		MyThread02 t1 = new MyThread02();
		MyThread02 t2 = new MyThread02();
		t1.start();
		t2.start();
		
		System.out.println("t1.isAlive(): " + t1.isAlive());
		System.out.println("t2.isAlive(): " + t2.isAlive());
		
		for(int i = 1; i <= 10; i++ ) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			//Thread.sleep(10);
		}
		//Thread.sleep(1000);
		System.out.println("before join t1.isAlive(): " + t1.isAlive());
		System.out.println("before join t2.isAlive(): " + t2.isAlive());
		//t1.join();
		//t2.join();
		System.out.println("t1.isAlive(): " + t1.isAlive());
		System.out.println("t2.isAlive(): " + t2.isAlive());
		System.out.println("End of Main Application");
	}
}

class MyThread02 extends Thread {
	public void run() {
		try {
			for(int i = 1; i <= 10; i++ ) {
				System.out.println(getName() + " : " + i);
				Thread.sleep(10);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
