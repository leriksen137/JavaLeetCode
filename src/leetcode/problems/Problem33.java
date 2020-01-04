package leetcode.problems;

import java.util.Arrays;

/**
 * Solution to <a href=
 * "https://leetcode.com/problems/search-in-rotated-sorted-array/">Search in
 * Rotated Sorted Array</a>
 * 
 * @author Laurent Eriksen
 */
public class Problem33 {

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
		int a = 0;
		int b = nums.length - 1;
		int m = (a + b) / 2;
		while (m != nums.length - 1 && nums[m] <= nums[m + 1]) {
			if (nums[a] > nums[m]) {
				// maximum is between a and m
				b = m;
			} else {
				// maximum is between m + 1 and b
				a = m + 1;
			}
			m = (a + b) / 2;
		}
		return m;
	}

	private int findTargetPosition(int[] numsSub, int target) {
		int a = 0;
		int b = numsSub.length - 1;
		int m = (a + b) / 2;
		while (a <= b) {
			if (numsSub[m] < target) {
				a = m + 1;
			} else if (numsSub[m] == target) {
				return m;
			} else {
				b = m - 1;
			}
			m = (a + b) / 2;
		}
		return -1; // element not found
	}

	public void run() {

		int[] nums = new int[] { 1, 3 };
		int target = 0;

		if (search(nums, target) != -1) {
			System.out.println(className + ": Failed");
			return;
		}

		nums = new int[] { 4, 5, 6, 7, 0, 1, 2 };
		target = 5;
		if (search(nums, target) != 1) {
			System.out.println(className + ": Failed");
			return;
		}

		nums = new int[] { 1, 3 };
		target = 2;
		if (search(nums, target) != -1) {
			System.out.println(className + ": Failed");
			return;
		}

		System.out.println(className + ": Success!");
	}

	private String className = Problem33.class.getName();

}