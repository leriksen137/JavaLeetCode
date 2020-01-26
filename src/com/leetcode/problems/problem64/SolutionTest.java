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
		int solution = s.minPathSum(grid);
		assertEquals(solution, 7);
	}

	@Test
	public void testMinPathEdgeCase() {
		int[][] grid = new int[][] { {} };
		int solution = s.minPathSum(grid);
		assertEquals(solution, 0);
	}
}
