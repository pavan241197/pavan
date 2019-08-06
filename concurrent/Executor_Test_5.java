package concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executor_Test_5 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Callable<String> callable = new Callable<String>() {
			@Override
			public String call() throws Exception {
				System.out.println("Enter Callable");
				Thread.sleep(2000);
				return "Task is done";
			}
		};
		System.out.println("submitting callable");
		Future<String> future = executorService.submit(callable);

		// this line executes immediately
		System.out.println("DO something else while callable is getting" +" " +"executed");
		System.out.println("Retrive the result of the future");
		// Future.get() blocks until the result is available
		String result = future.get();
		System.out.println(result);
		executorService.shutdown();
	}

}
