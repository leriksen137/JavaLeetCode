package com.leetcode.problems.problem78;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 78, problemName = "Subsets")
public class Solution {
	public List<List<Integer>> subsets(int[] nums) {
		int n = nums.length;
		int numberOfSubsets = pow(2, n);
		List<List<Integer>> solution = new ArrayList<>();
		for (int k = 0; k < numberOfSubsets; k++) {
			List<Integer> subset = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				if (isIthBinaryDigitOfKEqualToOne(i, k)) {
					subset.add(nums[i]);
				}
			}
			solution.add(subset);
		}

		return solution;
	}

	private int pow(int base, int exponent) {
		return (int) Math.pow(base, exponent);
	}

	private boolean isIthBinaryDigitOfKEqualToOne(int i, int k) {
		return (k / pow(2, i)) % 2 == 1;
	}
}