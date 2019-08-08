package capgemini_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Mapping {
	public static void main(String[] args) {
	List<String> locations=Arrays.asList("Chennai","Mumbai","Ongole","Pune");
		System.out.println("word length for locations");
		locations.stream().map(String::length).forEach(System.out::print);
		List<String> collect = locations.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
		Set<String> collect1 = locations.stream().collect(Collectors.toSet()); 
		System.out.println(collect1);
}
}
