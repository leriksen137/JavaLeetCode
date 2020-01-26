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
		int solution = s.uniquePaths(m, n);
		assertEquals(solution, 3);
	}

	@Test
	public void testUniquePathsBigExample() {
		int m = 10;
		int n = 10;
		int solution = s.uniquePaths(m, n);
		assertEquals(solution, 48620);
	}
}
