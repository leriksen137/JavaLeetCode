package com.leetcode.problems.problem34;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * leriksen137
 */
public class SolutionTest {

	@Test
	public void testSearchRange() {
		Solution s = new Solution();
		int[] nums = new int[] { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		int[] solution = s.searchRange(nums, target);

		assertTrue(solution[0] == 3);
		assertTrue(solution[1] == 4);
	}
}
