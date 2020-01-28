package com.leetcode.problems.problem75;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * leriksen137
 */
public class SolutionTest {
	Solution s;

	@Before
	public void initializeSolution() {
		s = new Solution();
	}

	@Test
	public void testSortColors() {
		int[] nums = new int[] { 2, 0, 2, 1, 1, 0 };
		s.sortColors(nums);
		int[] expected = new int[] { 0, 0, 1, 1, 2, 2 };
		assertArrayEquals(nums, expected);
	}
}
