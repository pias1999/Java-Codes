class MyThread extends Thread {
	public void run() {
		System.out.println("Inside the Run method: " + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println(1);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/*
 * class OurThread { }
 */
