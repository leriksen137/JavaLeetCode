package com.leetcode.problems.problem48;

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
	public void testRotate() {
		int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		s.rotate(matrix);
		assertEquals(matrix[0][0], 7);
		assertEquals(matrix[0][1], 4);
	}
}
