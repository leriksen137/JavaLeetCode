package com.leetcode.problems.problem34;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 34, problemName = "Find First and Last Position of Element in Sorted Array")
public class Solution {
	public int[] searchRange(int[] nums, int target) {
		int[] solution = new int[2];

		// binary search for start of range
		int first = 0;
		int last = nums.length - 1;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (nums[mid] < target) {
				first = mid + 1;
			} else if (nums[mid] == target && (mid == 0 || nums[mid - 1] < nums[mid])) {
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			// target not found
			solution[0] = -1;
			solution[1] = -1;
			return solution;
		}
		solution[0] = mid;

		// binary search for end of range
		first = 0;
		last = nums.length - 1;
		mid = (first + last) / 2;
		while (first <= last) {
			if (nums[mid] <= target) {
				first = mid + 1;
			} else if (nums[mid] == target && (mid == nums.length - 1 || nums[mid] < nums[mid + 1])) {
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		solution[1] = mid;

		return solution;
	}
}