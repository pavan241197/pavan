package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Executor_Test_2 {
	public static void main(String[] args) {
		System.out.println("Inside:" + Thread.currentThread().getName());
		System.out.println("Creating ExecutorServicewith a thread pool");
		// ExecutorService executorService = Executors.newFixedThreadPool(3);
		//ExecutorService executorService = Executors.newFixedThreadPool(3);
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		Runnable task1 = new Runnable() {
			public void run() {
				System.out.println("Executing task1 inside:" + Thread.currentThread().getName());
				try {
					TimeUnit.SECONDS.sleep(3);
				} catch (InterruptedException e) {
					throw new IllegalStateException(e);

				}
			}

		};
		Runnable task2 = new Runnable() {
			public void run() {
				System.out.println("Executing task2 inside:" + Thread.currentThread().getName());
				try {
					TimeUnit.SECONDS.sleep(4);
				} catch (InterruptedException e) {
					throw new IllegalStateException(e);

				}
			}

		};
		Runnable task3 = new Runnable() {
			public void run() {
				System.out.println("Executing task3 inside:" + Thread.currentThread().getName());
				try {
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e) {
					throw new IllegalStateException(e);

				}
			}

		};
		System.out.println("Submitting the tasks for execution");
		executorService.execute(task1);
		executorService.execute(task2);
		executorService.execute(task3);
		System.out.println("Shutting down the executor");
		executorService.shutdown();

	}
}
