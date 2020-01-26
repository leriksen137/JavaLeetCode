package com.leetcode.problems.problem41;

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
	public void testFirstMissingPositiveExample1() {
		int[] nums = new int[] { 1, 2, 0 };
		int solution = s.firstMissingPositive(nums);
		assertEquals(solution, 3);
	}

	@Test
	public void testFirstMissingPositiveExample2() {
		int[] nums = new int[] { 3, 4, -1, 1 };
		int solution = s.firstMissingPositive(nums);
		assertEquals(solution, 2);
	}

	@Test
	public void testFirstMissingPositiveExample3() {
		int[] nums = new int[] { 7, 8, 9, 11, 12 };
		int solution = s.firstMissingPositive(nums);
		assertEquals(solution, 1);
	}
}
