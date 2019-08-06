package capgemini.thread;

public class Main_thread {
	public static void main(String[] args) {
		System.out.println("Main thread Started");

		// how to get the handle of main thread...
		Thread currentThread = Thread.currentThread();
		System.out.println("Id:" + currentThread.getId() + "Name:" + currentThread.getName() + "Priority:"
				+ currentThread.getPriority());
		currentThread.setName("MainThread");
		currentThread.setPriority(Thread.MAX_PRIORITY);
		System.out.println(currentThread.getName());
		System.out.println(currentThread.getPriority());

		for (int index = 0; index < 10; index++) {
			System.out.println(currentThread.getName() + ":->" + index);
			try {
				Thread.sleep(10);
				System.out.println(Thread.activeCount());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("good morning");
			System.out.println("thread ended");
		}
	}
}