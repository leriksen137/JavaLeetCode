package leetcode.problems.problem31;

import java.util.Arrays;

import leetcode.template.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemName = "Next Permutation")
public class Solution {

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
}