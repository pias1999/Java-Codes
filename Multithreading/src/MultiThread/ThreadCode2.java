package MultiThread;

class One implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("One");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
	}
}

class Two implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Two");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class ThreadCode2 {
	public static void main(String[] args) {

		One obj1 = new One();
		Two obj2 = new Two();

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		t2.start();
	}
}
