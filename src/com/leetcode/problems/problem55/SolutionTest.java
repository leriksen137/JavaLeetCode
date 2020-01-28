package com.leetcode.problems.problem55;

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
	public void testcanJumpExample1() {
		int[] nums = new int[] { 2, 3, 1, 1, 4 };
		boolean actual = s.canJump(nums);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void testcanJumpExample2() {
		int[] nums = new int[] { 3, 2, 1, 0, 4 };
		boolean actual = s.canJump(nums);
		boolean expected = false;
		assertEquals(expected, actual);
	}
}
