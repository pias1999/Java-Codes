public class RunnableInterface {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();// t1 only contains run method
//t1.start(); here is an error because there is no start 
//method in runnable interface
		Thread t2 = new Thread(t1, "MyThread"); // create a thread
		t2.start(); // we can write it because there is a start method in thread class
//use parameter through the constructor into the Thread class object
		System.out.println("Inside the Main method: " + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println(2);// static Thread
		}																				// //currentThread() Returns
																							// a reference to the
																							// currently executing
																							// thread object.
//Returns : the currently executing thread.
	}
}
