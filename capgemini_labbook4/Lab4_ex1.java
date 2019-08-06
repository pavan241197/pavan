package capgemini_labbook4;

public class Lab4_ex1 {

	public static int  sumofSeries(int n) 
	{
		int a;
		a=((n*n)* (n+1)*(n+1))/4;
		return a;
}
	 public static  void main(String[] args)
		{
			int n = 5;
			System.out.println(sumofSeries(n));
		}

	}