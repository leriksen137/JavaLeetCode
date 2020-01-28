package com.leetcode.problems.problem26;

import static org.junit.Assert.assertEquals;

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
	public void testRemoveDuplicates() {
		int[] nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int actual = s.removeDuplicates(nums);
		int expected = 5;
		assertEquals(expected, actual);
	}
}
