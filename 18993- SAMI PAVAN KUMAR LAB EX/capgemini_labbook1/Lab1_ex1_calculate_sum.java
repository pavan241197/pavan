package capgemini_labbook1;

public class Lab1_ex1_calculate_sum
{

	public static int calculatesum(int n) 
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0||i%5==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
		public static void main(String[] args) 
		{
			int n =15;
			int result=calculatesum(n);
			System.out.println(result);
		}
			
			



}