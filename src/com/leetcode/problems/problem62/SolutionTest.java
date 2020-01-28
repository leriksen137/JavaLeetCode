package com.leetcode.problems.problem62;

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
	public void testUniquePathsSmallExample() {
		int m = 3;
		int n = 2;
		int actual = s.uniquePaths(m, n);
		int expected = 3;
		assertEquals(expected, actual);
	}

	@Test
	public void testUniquePathsBigExample() {
		int m = 10;
		int n = 10;
		int actual = s.uniquePaths(m, n);
		int expected = 48620;
		assertEquals(expected, actual);
	}
}
