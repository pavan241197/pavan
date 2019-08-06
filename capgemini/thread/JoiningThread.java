package capgemini.thread;

public class JoiningThread {
	public static void main(String[] args) {
		System.out.println("JoiningThread->started...");

		Thread T1 = new ExtendedThread("T1");
		Thread T2 = new ExtendedThread("T2");
		System.out.println("T1 started");
		T1.start();

		try {
			System.out.println("T1 join");
			T1.join();
			System.out.println("T1 is done");
		} catch (InterruptedException e) {
			System.err.println(T1.getName() + "Interrupted");
		}
		System.out.println("T2 started");
		T2.start();
		try {
			System.out.println("T2 join");
			T2.join();
			System.out.println("T1 is done");
		} catch (InterruptedException e) {
			System.err.println(T2.getName() + "Interrupted");
		}
		for (int num = 0; num < 10; num++) {
			System.out.println("\t" + Thread.currentThread().getName() + ":->" + num);
			try {
				Thread.sleep(100);
				System.out.println("main is done");
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
	}
}
