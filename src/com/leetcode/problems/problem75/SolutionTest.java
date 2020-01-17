package com.leetcode.problems.problem75;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

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
	public void testSortColors() {
		int[] nums = new int[] { 2, 0, 2, 1, 1, 0 };
		int[] nums2 = new int[] { 2, 0, 2, 1, 1, 0 };
		Arrays.sort(nums2);

		s.sortColors(nums);
		assertTrue(Arrays.equals(nums, nums2));
	}
}
