package FunctionalInterface;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test_Lamba_expression {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable");
			}
		};

		// implements runnable -> Lambda Expression
		Runnable runnable1 = () -> System.out.println("Lambda->hi....");
		Thread thread = new Thread(() -> System.out.println("Lambda->hi...."));
		thread.start();

		// passing implementation as a function argument
		Thread thread1 = new Thread(runnable);
		thread1.start();

		Callable<String> callable = new Callable<String>() {

			@Override
			public String call() throws Exception {
				return "Callabe done";
			}
		};

		// implements callable -> Lambda Expression
		Callable<String> callable1 = () -> {
			System.out.println("Callable->hi....");
			return "Callable done";
			};
			ExecutorService executorService = Executors.newSingleThreadExecutor();
			executorService.submit(callable);
			executorService.shutdown();
			
			
	}
}
	
	