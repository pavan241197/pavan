package capgemini_streams;

import java.util.Random;
import java.util.function.Consumer;
interface Ig
{
	void print(int[] arr);
}

public class Stream_test_1 {
	
	public static void main(String[] args) {
		//generate an arry
		//fill it with random numbers
		// print it
		int[] arr=new int[10];
		 Random rnd = new Random();
		 for(int i=1;i<10; i++) {
			arr[i]=(int)(Math.random()*100);
				 System.out.println(arr[i]);
			 }
		 }
	Consumer<Integer> consumer=System.out::println;
	

	}


