package com.leetcode.problems.problem26;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * leriksen137
 */
public class SolutionTest {

	@Test
	public void testRemoveDuplicates() {
		Solution s = new Solution();

		int[] nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int solution = s.removeDuplicates(nums);
		assertTrue(solution == 5);
	}
}
