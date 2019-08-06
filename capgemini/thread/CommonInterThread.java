package capgemini.thread;

public class CommonInterThread {
	public static void main(String[] args) {
		System.out.println("CommonInterThread-> ended...");
		Account account = new Account();

		new Thread() {
			public void run() {
				account.withdraw(2000);
			}
		}.start();
		new Thread() {
			public void run() {
				account.deposit(10000);
			}
		}.start();
		System.out.println("InternalThreadCommunication ended.....");
	}
}

class Account {
	int amount = 1000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw.....");
		if (this.amount < amount) {
			System.out.println("less balannce; waiting for deposit");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed");
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed...");
		notify();
	}
}
