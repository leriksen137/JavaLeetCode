package com.leetcode.problems.problem41;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 41, problemName = "First Missing Positive")
public class Solution {
	public int firstMissingPositive(int[] nums) {
		int firstMissingPositive = 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 1) {
				// noop, can Ignore
			} else {
				// TODO write some code here
			}
		}

		return firstMissingPositive;
	}
}