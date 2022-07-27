public class TestThread06Synchronization {
	public static void main(String[] args) throws Exception{
		SharedResource sharedObj = new SharedResource();
		CallerThreads caller1 = new CallerThreads(sharedObj, "Thread Synchronization Demo Applicatio");
		CallerThreads caller2 = new CallerThreads(sharedObj, "Hi.. How are you");
		caller1.start();
		caller2.start();
		sharedObj.sendMessage("Weclome to WibMo");
	}
}
class SharedResource{
	//void sendMessage(String message) throws Exception{
	synchronized void sendMessage(String message) throws Exception{
		System.out.print("[");
		String strArr[] = message.split(" ");
		for(String s : strArr) {
			System.out.print(s + " ");
			Thread.sleep(1);
		}
		System.out.println("]");		
	}
}
class CallerThreads extends Thread{
	SharedResource sharedObject;
	String message;
	public CallerThreads(SharedResource sharedObject, String message) {
		this.sharedObject = sharedObject;
		this.message = message;
	}
	public void run() {
		try {
			sharedObject.sendMessage(message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}