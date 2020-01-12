package com.leetcode.problems.problem70;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 70, problemName = "Climbing Stairs")
public class Solution {
	// same as fibonacci sequence with different initial conditions
	public int climbStairs(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;

		int[] climbingStairsCombination = new int[n];
		climbingStairsCombination[0] = 1;
		climbingStairsCombination[1] = 2;
		for (int i = 2; i < n; i++) {
			climbingStairsCombination[i] = climbingStairsCombination[i - 1] + climbingStairsCombination[i - 2];
		}

		return climbingStairsCombination[n - 1];
	}
}