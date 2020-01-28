package com.leetcode.problems.problem136;

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
	public void testSingleNumberExample1() {
		int[] nums = new int[] { 2, 2, 1 };
		int actual = s.singleNumber(nums);
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	public void testSingleNumberExample2() {
		int[] nums = new int[] { 4, 1, 2, 1, 2 };
		int actual = s.singleNumber(nums);
		int expected = 4;
		assertEquals(expected, actual);
	}
}
