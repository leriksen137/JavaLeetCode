package com.leetcode.problems.problem70;

import static org.junit.Assert.assertTrue;

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
		int solution = s.climbStairs(n);
		assertTrue(solution == 2);
	}

	@Test
	public void testClimbingStairsExample2() {
		int n = 3;
		int solution = s.climbStairs(n);
		assertTrue(solution == 3);
	}
}
