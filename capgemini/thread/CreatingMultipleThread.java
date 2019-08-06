package capgemini.thread;

public class CreatingMultipleThread {
	public static void main(String[] args) {
		System.out.println("CreatingMultipleThread->started");
		/*for (int i = 0; i <= 10; i++) {
			new Thread("Thread-" + i + ":") {
				public void run() {
					System.out.println(getName() + "running");
				}
			}.start();
		}*/
		
	
	for (int i = 0; i <= 10; i++) {
		Thread t= new Thread("Thread-" + i + ":") {
			public void run() {
				System.out.println(getName() + "running");
			}
		};
		t.start();
		try {
			t.join();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	System.out.println("CreatingMultipleThread->ended");
	}
}