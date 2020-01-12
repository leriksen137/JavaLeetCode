package com.leetcode.problems.problem53;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 53, problemName = "Maximum Subarray")
public class Solution {
	public int maxSubArray(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int solution = nums[0];
		int sumSinceRangeStart = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (sumSinceRangeStart < 0) {
				// start new range
				sumSinceRangeStart = nums[i];

			} else {
				sumSinceRangeStart = sumSinceRangeStart + nums[i];
			}

			if (sumSinceRangeStart > solution) {
				solution = sumSinceRangeStart;
			}
		}
		return solution;
	}
}