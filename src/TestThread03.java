public class TestThread03 {
	public static void main(String[] args) throws Exception{
		MyThread03 t1 = new MyThread03();
		System.out.println("t1.getState() : " + t1.getState());
		t1.start();
		System.out.println("t1.getState() : " + t1.getState());
		Thread.sleep(10);
		System.out.println("t1.getState() : " + t1.getState());
		t1.join();
		System.out.println("t1.getState() : " + t1.getState());
		
		
	}
}

class MyThread03 extends Thread {
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

