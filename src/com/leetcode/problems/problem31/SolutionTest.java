package com.leetcode.problems.problem31;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * leriksen137
 */
public class SolutionTest {

	@Test
	public void testNextPermutation() {
		Solution s = new Solution();
		int[] nums = new int[] { 2, 4, 3, 1 };
		s.nextPermutation(nums);
		assertTrue(Arrays.equals(nums, new int[] { 3, 1, 2, 4 }));
	}
}
