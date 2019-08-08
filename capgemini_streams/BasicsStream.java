package capgemini_streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class BasicsStream {
	public static void main(String[] args) {
		Integer nums[]=new Integer[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i]=(int) (Math.random()*100);
		}
		

		//consumer->lambda expression
		//stream0.forEach((value) -> System.out.println(value));

		//stream0.forEach(System.out::println); //Method reference
		
		// obtaining a stream
		Integer arr[]=new Integer[] {10,2,5,7,8,9,90,76,45};
		Stream<Integer>stream0=Arrays.stream(arr);
		//Stream<Integer> stream=Arrays.stream(arr);
		
		//stream0.distinct().forEach(System.out::println);
		//stream0.distinct().limit(3).forEach(System.out::println);
		
		Predicate<Integer>oddPredicate = (value)-> value%2==0;
		stream0.filter(oddPredicate).forEach(System.out::println);
		
		//long count= stream0.count();
		// print min
		//stream0.sorted().limit(2).forEach(System.out::println);
		// print max
		
		Comparator<Integer>comp = ((num1,num2)->(num1>num2?1:num2>num1?-1:0));
		Optional<Integer> optionalmax =
		stream0.max(comp);
		System.out.println(optionalmax.get());
		
		
	}

}