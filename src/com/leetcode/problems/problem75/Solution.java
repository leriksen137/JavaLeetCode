package com.leetcode.problems.problem75;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 75, problemName = "SortColors")
public class Solution {
	public void sortColors(int[] nums) {
		int zeroInsertIndex = 0;
		int twoInsertIndex = nums.length - 1;
		for (int i = 0; i <= twoInsertIndex && i < nums.length;) {
			if (nums[i] == 0 && i > zeroInsertIndex) {
				swap(nums, i, zeroInsertIndex++);
			} else if (nums[i] == 2 && i < twoInsertIndex) {
				swap(nums, i, twoInsertIndex--);
			} else {
				i++;
			}
		}
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}