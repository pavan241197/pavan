package capgemini.thread;

public class Multiple_thread {
	public static void main(String[] args) {
		System.out.println("Multiple Thread started");
		// anonymous class implementation/...
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable is running...");
			}
		};
		Thread thread1 = new Thread(runnable);
		thread1.start();
		// anonymous class implementation for Thread class
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				System.out.println("Thread is running");
			}
		};
		thread2.start();
		System.out.println("MultipleThread ended...");

	}
}
