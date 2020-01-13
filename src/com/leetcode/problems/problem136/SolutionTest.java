package com.leetcode.problems.problem136;

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
	public void testSingleNumberExample1() {
		int[] nums = new int[] { 2, 2, 1 };
		int solution = s.singleNumber(nums);
		assertTrue(solution == 1);
	}

	@Test
	public void testSingleNumberExample2() {
		int[] nums = new int[] { 4, 1, 2, 1, 2 };
		int solution = s.singleNumber(nums);
		assertTrue(solution == 4);
	}
}
