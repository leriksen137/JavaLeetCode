package com.leetcode.problems.problem33;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * leriksen137
 */
public class SolutionTest {

	@Test
	public void testSearch() {
		Solution s = new Solution();
		int[] nums = new int[] { 4, 5, 6, 7, 0, 1, 2 };
		int target = 5;
		int position = s.search(nums, target);

		assertTrue(position == 1);
	}
}
