package com.leetcode.problems.problem42;

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
	public void testTrappingRainWater() {
		int[] nums = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int actual = s.trap(nums);
		int expected = 6;
		assertEquals(expected, actual);
	}

	@Test
	public void testTrappingRainWaterEdgeCase() {
		int[] nums = new int[0];
		int actual = s.trap(nums);
		int expected = 0;
		assertEquals(expected, actual);
	}
}
