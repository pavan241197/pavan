import java.util.Arrays;

public class Array {

	public static void main(String[] args)
	{
		int[] nums = { 1, 2, 3, 4, 5 };
		for (int index = 0; index < nums.length; index++)
		{
			System.out.println(nums[index]);
		}
		{
			char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
			System.out.println(Arrays.toString(vowels));

		}
	}
}
