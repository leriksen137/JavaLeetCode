package leetcode.problems;

import leetcode.template.LeetCode;
import leetcode.template.LeetCodeAnnotation;

/**
 * 
 * @author leriksen137
 */
@LeetCodeAnnotation(name = "Next Permutation", url = "https://leetcode.com/problems/next-permutation/")
public class Problem31 implements LeetCode {

	public void nextPermutation(int[] nums) {
		int temp;
		for (int i = nums.length - 1; i > 0; i--) {
			temp = nums[i];
			nums[i] = nums[i - 1];
			nums[i - 1] = temp;
			if (nums[i - 1] > nums[i]) {
				return;
			}
		}
	}

	@Override
	public void run() {
		int[] nums = new int[] { 2, 3, 4, 1 };

		nextPermutation(nums);

		assert null != null : "Assertion failed in " + this.getClass().getName();

	}
}