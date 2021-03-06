package com.leetcode.problems.problem11;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 11, problemName = "Container With Most Water")
public class Solution {
	public int maxArea(int[] height) {
		int maxArea = 0;
		int left = 0;
		int right = height.length - 1;

		while (left != right) {
			int area = calculateArea(height, left, right);
			if (area > maxArea) {
				maxArea = area;
			}
			if (height[left] > height[right]) {
				right--;
			} else {
				left++;
			}
		}
		return maxArea;
	}

	int calculateArea(int[] height, int left, int right) {
		int length = Math.abs(left - right);
		int containerHeight = Math.min(height[left], height[right]);
		return length * containerHeight;
	}
}