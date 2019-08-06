package FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterface_Test {
	public static void main(String[] args) {
		Consumer<String> consumer= (String str) ->System.out.println(str);
		consumer.accept("consumer.accept");
		
		Supplier<String> supplier =()->"supplier.get():";
		System.out.println(supplier.get());
		
		Predicate<Integer>predicate =num-> num%2==0;
		System.out.println("Predicate.test()"+predicate.test(10));
		
		BiFunction<Integer, Integer, Integer> maxFunction =(x,y)->x>y?x:y;
		System.out.println("Bi.Function.apply():"+maxFunction.apply(10, 20));
	}

}
