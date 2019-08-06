package capgemini_labbook1;


public class Lab1_ex_2_diff {
	
		public static int  diff(int n) 
		{
			int a,b,c;
			a=(n*(n+1)*((2*n)+1))/6;
			b=(n*(n+1))/2;
			c=b*b;
			return a-c;
		}
			

	
	  public static void main(String[] args)
		{
			int n=3;
			System.out.println(diff(n));
		}

	}





