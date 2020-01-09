package leetcode.problems;

import java.util.Arrays;

import leetcode.template.LeetCode;
import leetcode.template.LeetCodeAnnotation;

/**
 * 
 * @author leriksen137
 */
@LeetCodeAnnotation(name = "Next Permutation", url = "https://leetcode.com/problems/next-permutation/")
public class Problem31 implements LeetCode {

	public void nextPermutation(int[] nums) {
		int startOfAscending = nums.length - 2;
		while (startOfAscending >= 0 && nums[startOfAscending] >= nums[startOfAscending + 1])
			startOfAscending--;
		if (startOfAscending == -1) {
			Arrays.sort(nums);
		} else {
			for (int j = nums.length - 1; j > startOfAscending; j--) {
				if (nums[j] > nums[startOfAscending]) {
					swap(nums, startOfAscending, j);
					break;
				}
			}

			for (int k = startOfAscending + 1, l = nums.length - 1; l > k; k++, l--) {
				swap(nums, k, l);
			}
		}
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[j];
		nums[j] = nums[i];
		nums[i] = temp;
	}

	@Override
	public void run() {
		int[] nums = new int[] { 2, 4, 3, 1 };

		nextPermutation(nums);

		assert Arrays.equals(nums, new int[] { 3, 1, 2, 4 }) : "Assertion failed in " + this.getClass().getName();
	}
}