package com.leetcode.problems.problem55;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 55, problemName = "Jump Game")
public class Solution {
	public boolean canJump(int[] nums) {
		boolean[] reachable = new boolean[nums.length];
		reachable[0] = true;

		boolean solution = jumpAllPossibleDistances(nums, reachable, 0);

		return solution;
	}

	private boolean jumpAllPossibleDistances(int[] nums, boolean[] reachable, int jumpStartIndex) {
		if (jumpStartIndex == nums.length - 1) {
			return true;
		}
		boolean done = false;
		for (int iterationIndex = 1; !done && iterationIndex <= nums[jumpStartIndex]; iterationIndex++) {
			if (!reachable[jumpStartIndex + iterationIndex]) {
				reachable[jumpStartIndex + iterationIndex] = true;
				done = jumpAllPossibleDistances(nums, reachable, jumpStartIndex + iterationIndex);
			}
		}
		return done;
	}
}