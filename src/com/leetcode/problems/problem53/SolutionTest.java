package com.leetcode.problems.problem53;

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
	public void maxSubArray() {
		int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int actual = s.maxSubArray(nums);
		int expected = 6;
		assertEquals(expected, actual);
	}

	@Test
	public void maxSubArrayOnlyPositive() {
		int[] nums = new int[] { 1, 2, 3, 4 };
		int actual = s.maxSubArray(nums);
		int expected = 10;
		assertEquals(expected, actual);
	}

	@Test
	public void maxSubArrayOnlyNegative() {
		int[] nums = new int[] { -4, -3, -2, -1 };
		int actual = s.maxSubArray(nums);
		int expected = -1;
		assertEquals(expected, actual);
	}

	@Test
	public void maxSubArrayEdgeCaseOneEntry() {
		int[] nums = new int[] { -42 };
		int actual = s.maxSubArray(nums);
		int expected = -42;
		assertEquals(expected, actual);
	}

}
