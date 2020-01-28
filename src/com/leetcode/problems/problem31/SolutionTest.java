package com.leetcode.problems.problem31;

import static org.junit.Assert.assertArrayEquals;

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
	public void testNextPermutation() {
		int[] nums = new int[] { 2, 4, 3, 1 };
		s.nextPermutation(nums);
		int[] expected = new int[] { 3, 1, 2, 4 };
		assertArrayEquals(nums, expected);
	}
}
