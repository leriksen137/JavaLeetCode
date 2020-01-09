package leetcode.problems.problem33;

import java.util.Arrays;

import leetcode.template.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemName = "Search in Rotated Sorted Array")
public class Solution {

	public int search(int[] nums, int target) {
		// catch special cases
		int length = nums.length;
		if (length == 0) {
			return -1;
		}
		if (length == 1) {
			if (nums[0] == target) {
				return 0;
			} else {
				return -1;
			}
		}

		// use binary search to find the position of the maximum
		int maxPos = findMaxPosition(nums);

		// identify the part to do binary search on for finding target
		if (nums[0] <= target) {
			// target is in range [0, maxPos]
			return findTargetPosition(Arrays.copyOfRange(nums, 0, maxPos + 1), target);
		} else {
			// target is in range (maxPos, length)
			int posInSubArray = findTargetPosition(Arrays.copyOfRange(nums, maxPos + 1, length), target);
			return posInSubArray == -1 ? -1 : maxPos + 1 + posInSubArray;
		}
	}

	private int findMaxPosition(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		int mid = (left + right) / 2;
		while (mid != nums.length - 1 && nums[mid] <= nums[mid + 1]) {
			if (nums[left] > nums[mid]) {
				right = mid;
			} else {
				left = mid + 1;
			}
			mid = (left + right) / 2;
		}
		return mid;
	}

	private int findTargetPosition(int[] numsSub, int target) {
		int left = 0;
		int right = numsSub.length - 1;
		int mid = (left + right) / 2;
		while (left <= right) {
			if (numsSub[mid] < target) {
				left = mid + 1;
			} else if (numsSub[mid] == target) {
				return mid;
			} else {
				right = mid - 1;
			}
			mid = (left + right) / 2;
		}
		return -1;
	}
}