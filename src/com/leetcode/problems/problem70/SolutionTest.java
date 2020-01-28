package com.leetcode.problems.problem70;

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
	public void testClimbingStairsExample1() {
		int n = 2;
		int actual = s.climbStairs(n);
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void testClimbingStairsExample2() {
		int n = 3;
		int actual = s.climbStairs(n);
		int expected = 3;
		assertEquals(expected, actual);
	}
}
