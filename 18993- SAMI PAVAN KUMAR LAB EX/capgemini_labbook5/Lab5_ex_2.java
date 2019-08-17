package capgemini_labbook5;

import java.util.Scanner;

public class Lab5_ex_2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int no1=1,no2=1,temp=0,n,i;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		System.out.println(fibonacci(n));
		for(i=2;i<n;i++)
		{
			temp=no1+no2;
			no1=no2;
			no2=temp;
		}
		System.out.println(temp);
		}
		private static int fibonacci (int n) {
			if(n<=1)
			{
				return n;
			}
			else
			{
				return  fibonacci(n-1)+ fibonacci(n-2);
			}
	}

}
