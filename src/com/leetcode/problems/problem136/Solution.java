package com.leetcode.problems.problem136;

import java.util.Arrays;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 136, problemName = "Single Number")
public class Solution {
	public int singleNumber(int[] nums) {
		int result = 0;
		for (int num : nums) {
			result ^= num;
		}
		return result;
	}

	public int singleNumberMyWrongSolution(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}

		Arrays.sort(nums); // more than Linear complexity!!

		for (int i = 0; i < nums.length - 1; i += 2) {
			if (nums[i] != nums[i + 1]) {
				for (int j = i + 2; j < nums.length; j++) {
					if (nums[j] == nums[i]) {
						return nums[i + 1];
					}
					if (nums[j] == nums[i + 1]) {
						return nums[i];
					}
				}
			}
		}
		return nums[nums.length - 1];
	}
}