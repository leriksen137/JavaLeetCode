package leetcode.problems;

import leetcode.template.LeetCode;

/**
 * Solution to <a href= "https://leetcode.com/problems/next-permutation/">Next
 * Permutation</a>
 * 
 * @author leriksen137
 */
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

	// NOT SOLVED YET
	@Override
	public void run() {
		int[] nums = new int[] { 2, 3, 4, 1 };
		// 3 1 2 4

		assert nums[0] == 2 : "Wrong solution";
	}
}