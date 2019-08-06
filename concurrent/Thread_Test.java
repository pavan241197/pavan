package concurrent;
public class Thread_Test {
	public static void main(String[] args) {
		//1.implementing Runnable interface
		Runnable runnable1 = new HelloRunnable();
		Thread RunnableThread = new Thread(runnable1);
		RunnableThread.start();
		
		//2. Implementing Anonymous class
		Runnable runnable2= new Runnable() {
		@Override
		public void run() {
			System.out.println("Hello Anonymous");
		}
	};
	Thread anonymousThread = new Thread(runnable2);
	anonymousThread.start();
	//3. Implementing Lambda Expressionns
	Runnable runnable3=()->System.out.println("Hello Lambda");
	Thread lambdaThread1= new Thread (runnable3);
	lambdaThread1.start();
	
	Thread lambdaThread2 = new Thread(()-> System.out.println("lambda wow"));
	lambdaThread2.start();
	}
	

}

class HelloRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("Hello Runnable");
	}
}
