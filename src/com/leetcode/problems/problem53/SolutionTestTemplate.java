package com.leetcode.problems.problem53;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * leriksen137
 */
public class SolutionTestTemplate {
	Solution s;

	@Before
	public void initializeSolution() {
		s = new Solution();
	}

	@Test
	public void maxSubArray() {
		int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int solution = s.maxSubArray(nums);
		assertTrue(solution == 6);
	}

	@Test
	public void maxSubArrayOnlyPositive() {
		int[] nums = new int[] { 1, 2, 3, 4 };
		int solution = s.maxSubArray(nums);
		assertTrue(solution == 10);
	}

	@Test
	public void maxSubArrayOnlyNegative() {
		int[] nums = new int[] { -4, -3, -2, -1 };
		int solution = s.maxSubArray(nums);
		assertTrue(solution == -1);
	}

	@Test
	public void maxSubArrayEdgeCaseOneEntry() {
		int[] nums = new int[] { -42 };
		int solution = s.maxSubArray(nums);
		assertTrue(solution == -42);
	}

}
