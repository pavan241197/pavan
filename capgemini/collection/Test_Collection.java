package capgemini.collection;

import java.util.Arrays;

public class Test_Collection {
	 public static void main(String[] args) {
		 //int array...
		int[] nums={1,2,3,4,5,6,7,8,9};
		for (int index= 0 ; index<nums.length; index++ ) {
			System.out.println(nums[index]);
		}
	 System.out.println("Natural order:" +Arrays.toString(nums));
	for (int num:nums) {
		System.out.println(num);
	}
	//arrays....
	Arrays.sort(nums);
	System.out.println("Sorted Order:"+Arrays.toString(nums));
	// char arrays....
	char[] alpha = {'A','D','B','F','E'};
	System.out.println("Natural Order :"+Arrays.toString(alpha));
	Arrays.sort(alpha);
	System.out.println("Sorted Order :"+Arrays.toString(alpha));
}
}
