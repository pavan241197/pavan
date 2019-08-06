package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor_Test_1 {
	public static void main(String[] args) {
		System.out.println("Inside:" + Thread.currentThread().getName());
		System.out.println("Creating Executor Service with single worker thread");
		ExecutorService executorService =  Executors.newSingleThreadExecutor();
		// ExecutorService executorService= Executors.newSingleThreadExecutor();
		System.out.println("Creating a runnable...");
		Runnable task = new Runnable() {
			public void run() {
				System.out.println("Inside:" + Thread.currentThread().getName());
			}
		};

		System.out.println("submit the specified task by the runnable to executor");
		((java.util.concurrent.ExecutorService) executorService).submit(task);
		// executorService.submit(task);
		System.out.println("shuttingdown the executor");
		((java.util.concurrent.ExecutorService) executorService).shutdown();
	}

}
