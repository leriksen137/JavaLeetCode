package com.leetcode.problems.problem64;

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
	public void testMinPathExample() {
		int[][] grid = new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int actual = s.minPathSum(grid);
		int expected = 7;
		assertEquals(expected, actual);
	}

	@Test
	public void testMinPathEdgeCase() {
		int[][] grid = new int[][] { {} };
		int actual = s.minPathSum(grid);
		int expected = 0;
		assertEquals(expected, actual);
	}
}
