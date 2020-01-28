package com.leetcode.problems.problem11;

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
	public void testMaxArea() {
		int[] height = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int actual = s.maxArea(height);
		int expected = 49;
		assertEquals(actual, expected);
	}
}
