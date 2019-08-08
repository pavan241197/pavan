package FunctionalInterface;
import java.util.*;

interface Calculate {
int add(int num1, int num2);
}

public class Test_Lamba_Expression2 {
	Calculate calc = new Calculate() {
		@Override
		public int add(int num1, int num2)  {
			return num1+num2;
	};
	Calculate calc1=(int num1, int num2) ->{
		return num1+num2;
	};	
	Calculate calc2=(num1,num2) ->  {
	return num1+num2;
	};
	{
	System.out.println("Addition:"+calc2.add(10,20));
	}
	};
}



