package com.leetcode.problems.problem42;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 42, problemName = "Trapping Rain Water")
public class Solution {
	public int trap(int[] height) {
		int waterVolume = 0;

		int waterLevel = 1;
		boolean foundWater = true;
		int[] boundaries = new int[2];
		while (foundWater) {
			foundWater = findLeftAndRightBoundariesForWaterlevel(waterLevel, boundaries);
			waterLevel++;
		}

		return waterVolume;
	}

	private boolean findLeftAndRightBoundariesForWaterlevel(int waterLevel, int[] boundaries) {
		int left = 0;
		int right = 0;

		return right == 0;
	}
}