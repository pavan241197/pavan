package capgemini_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduced_Stream {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(5,7,13,9,56);
		Optional<Integer> result = intList.stream().filter((a)->a>0).reduce((a,b)->a>b?a:b);
		System.out.println(intList);
	}
}
