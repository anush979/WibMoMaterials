
public class TestThread04 {
	public static void main(String[] args) {
		MyThread04 t1 = new MyThread04();
		System.out.println("t1.getPriority() : " + t1.getPriority());
		//Thread Priority Range is 1 to 10
		// 1  - Least priority
		// 10 - Highest Priority
		// 5  - Default Priority
		
		t1.setPriority(10);
		System.out.println("t1.getPriority() : " + t1.getPriority());
		System.out.println("Thread.currentThread().getPriority() : " + Thread.currentThread().getPriority());
		
		System.out.println("t1.getId() : " + t1.getId());
		System.out.println("Thread.currentThread().getId() : " + Thread.currentThread().getId());
		
		System.out.println("t1.getThreadGroup() : " + t1.getThreadGroup());
		System.out.println("Thread.currentThread().getThreadGroup() : " + Thread.currentThread().getThreadGroup());
		
		System.out.println("t1.isDaemon() : " + t1.isDaemon());
		t1.setDaemon(true);
		System.out.println("t1.isDaemon() : " + t1.isDaemon());

	}
}

class MyThread04 extends Thread {
	public void run() {
		try {
			for(int i = 1; i <= 10; i++ ) {
				System.out.println(getName() + " : " + i);
				Thread.sleep(1000);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}