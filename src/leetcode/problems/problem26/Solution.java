package leetcode.problems.problem26;

import leetcode.template.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemName = "Remove Duplicates from Sorted Array")
public class Solution {

	public int removeDuplicates(int[] nums) {
		if (nums.length < 2) {
			return nums.length;
		}

		int insertIndex = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				nums[insertIndex++] = nums[i];
			}
		}
		return insertIndex;
	}
}