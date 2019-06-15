package MultiThread;

class One extends Thread {
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

class Two extends Thread {
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

public class ThreadCode {
	public static void main(String[] args) {

		One obj1 = new One();
		Two obj2 = new Two();

		obj1.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		obj2.start();
	}
}
