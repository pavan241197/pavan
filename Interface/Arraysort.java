package Interface;

import java.util.Arrays;

public interface Arraysort {
	void sortAsc();

	void sortdes();
}

class ArraySortImpl implements Arraysort {
	int[] nums;

	public ArraySortImpl(int[] nums) {
		this.nums = nums;
	}

	public void sortAsc() {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					if (nums[i] > nums[i + 1]) {
						int temp;
						temp = nums[i];
						nums[i] = nums[i + 1];
						nums[i + 1] = temp;
					}
				}
			}
		}
	}

	public void sortDes() {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - 1; j++) {
				if (nums[j] < nums[j + 1]) {
					int temp;
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
	}

	public void print() {
		System.out.println(Arrays.toString(nums));
	}

	public class Arraysort {
		public void main(String[] args) {
			int[] nums = { 1, 5, 4, 3, 6, 2, 7, 10, 9, 8 };
			ArraySortImpl arraysortImpl = new ArraySortImpl(nums);
			arraysortImpl.sortAsc();
			arraysortImpl.print();
		}
	}

	@Override
	public void sortdes() {
		// TODO Auto-generated method stub

	}
}
