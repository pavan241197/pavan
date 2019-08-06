package capgemini.thread;

public class RunnableThread implements Runnable {
	public void run() {
		for (int num = 0; num < 10; num++) {
			System.out.println("\t" + Thread.currentThread().getName() + ":->" + num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("RunnableThread->started");
		// spawing a runnable instance of a thread
		// Thread(runnable target)
		Thread runnableThread = new Thread(new RunnableImpl());
		// start method instructs OS to allocate resources and and JRE calls run
		// method;
		runnableThread.start();
		System.out.println("RunnableThread->ended");
	}

}

class RunnableImpl implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread Running");
	}

}
