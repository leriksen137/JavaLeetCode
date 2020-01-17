package com.leetcode.problems.problem42;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 42, problemName = "Trapping Rain Water")
public class Solution {
	// solution idea: https://i.imgur.com/gAfYLMQ.png
	public int trap(int[] height) {
		if (height.length == 0) {
			return 0;
		}

		int[] highestBoundaryEncounteredLeft = new int[height.length];
		int maxFromLeft = height[0];
		for (int i = 0; i < height.length; i++) {
			if (height[i] > maxFromLeft) {
				maxFromLeft = height[i];
			}
			highestBoundaryEncounteredLeft[i] = maxFromLeft;
		}

		int[] highestBoundaryEncounteredRight = new int[height.length];
		int maxFromRight = height[height.length - 1];
		for (int i = height.length - 1; i >= 0; i--) {
			if (height[i] > maxFromRight) {
				maxFromRight = height[i];
			}
			highestBoundaryEncounteredRight[i] = maxFromRight;
		}

		// water volume = union of "left" and "right"
		int waterVolume = 0;
		for (int i = 0; i < height.length; i++) {
			waterVolume += Math.min(highestBoundaryEncounteredLeft[i], highestBoundaryEncounteredRight[i]) - height[i];
		}

		return waterVolume;
	}
}