package capgemini_labbook10;

public class Lab10_Ex2_Timer implements Runnable {

	int count = 0, count1 = 0;

	@Override
	public void run() {
		while (true) {
			System.out.print(count++ + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (count == 11) {
				count = 0;
				System.out.println();
			}
		}
	};

	public static void main(String[] args) {

		Thread t = new Thread(new Lab10_Ex2_Timer());
		t.start();

	}

}
