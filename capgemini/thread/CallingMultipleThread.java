package capgemini.thread;

public class CallingMultipleThread {
	public static void main(String[] args) {
		System.out.println("CallingMultipleThread...");
		Thread extendedThread = new ExtendedThread("ExtendedThread");
		extendedThread.start();

		Thread runnableThread = new Thread(new RunnableThread(), "RunnableThread");
		runnableThread.start();
		for (int index = 0; index < 10; index++) {
			System.out.println("\t" + Thread.currentThread().getName() + ":->" + index);
			try {
				Thread.sleep(10);
				System.out.println(Thread.activeCount());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("CallingMultipleThread->ended");

	}

}
