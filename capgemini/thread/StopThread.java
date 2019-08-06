package capgemini.thread;

public class StopThread {
	public static void main(String[] args) {
		System.out.println("StopThread->started");
		StoppableThread stoppableThread = new StoppableThread("StoppableThread");
		stoppableThread.start();
		try {
			Thread.sleep(10L * 1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		stoppableThread.doStop();
		System.out.println("StopThread->ended");
	}
}

class StoppableThread extends Thread {
	private boolean doStop = false;

	public StoppableThread(String threadName) {
		super(threadName);
	}

	public synchronized void doStop() {
		this.doStop = true;
	}

	public synchronized boolean keepRunning() {
		return this.doStop == false;
	}

	@Override
	public void run() {
		while (keepRunning()) {
			System.out.println(getName() + "->Running....");
			try {
				Thread.sleep(3L * 1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
