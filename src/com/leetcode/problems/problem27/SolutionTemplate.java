package com.leetcode.problems.problem27;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 27, problemName = "Remove Element")
public class SolutionTemplate {
	public int removeElement(int[] nums, int val) {
		int valFound = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				valFound++;
			} else {
				nums[i - valFound] = nums[i];
			}
		}

		return nums.length - valFound;
	}
}