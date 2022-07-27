public class TestThread01 {
	public static void main(String[] args) throws Exception{
		System.out.println("Start of Main Application");
		MyThread01 t1 = new MyThread01();
		MyThread01 t2 = new MyThread01();
		//t1.setName("Child-1");
		//t2.setName("Child-2");
		t1.start();
		t2.start();
		for(int i = 1; i <= 10; i++ ) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			Thread.sleep(10);
		}
		System.out.println("End of Main Application");
	}
}
class MyThread01 extends Thread {
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
