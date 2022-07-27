public class TestThread07ProducerConsumer {
	public static void main(String[] args) throws Exception{
		Box box = new Box();
		ProducerThread producer = new ProducerThread(box);
		ConsumerThread consumer = new ConsumerThread(box);
		producer.start();
		consumer.start();
	}
}
class Box{
	int item;
	boolean isEmpty = true;		//if isEmpty true  BOX is empty
								//if isEmpty false BOX is full
	synchronized void put(int item) throws Exception{
		if(!isEmpty) {			//if !isEmpty Producer should wait
			wait();				//Producer will come out of wait if Consumer get() the item and mark isEmpty true and notifies Producer 
		}
		this.item = item;
		System.out.println("PUT : " + this.item);
		isEmpty = false;
		notify();				//notifying consumers waiting for new item in the box
	}
	synchronized void get() throws Exception{
		if(isEmpty) {			//if isEmpty Consumer should wait
			wait();				//Consumer will come out of wait if Producer put() new item and mark isEmpty false and notifies Consumer
		}
		System.out.println("GET : " + this.item);
		isEmpty = true;
		notify();
	}
}
class ProducerThread extends Thread{
	Box box;
	public ProducerThread(Box box) {
		this.box = box;
	}
	public void run() {
		try {
			int itemVal = 1;
			while(true) {
				box.put(itemVal);
				itemVal++;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class ConsumerThread extends Thread{
	Box box;
	public ConsumerThread(Box box) {
		this.box = box;
	}
	public void run() {
		try {
			while(true) {
				box.get();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}	
}

