package com.leetcode.problems.problem11;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * leriksen137
 */
public class SolutionTest {

	@Test
	public void testMaxArea() {
		Solution s = new Solution();

		int[] height = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int solution = s.maxArea(height);
		assertTrue(solution == 49);
	}
}
