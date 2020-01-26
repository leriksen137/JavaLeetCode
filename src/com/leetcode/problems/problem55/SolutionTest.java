package com.leetcode.problems.problem55;

import static org.junit.Assert.assertFalse;
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
	public void testcanJumpExample1() {
		int[] nums = new int[] { 2, 3, 1, 1, 4 };
		boolean solution = s.canJump(nums);
		assertTrue(solution);
	}

	@Test
	public void testcanJumpExample2() {
		int[] nums = new int[] { 3, 2, 1, 0, 4 };
		boolean solution = s.canJump(nums);
		assertFalse(solution);
	}
}
