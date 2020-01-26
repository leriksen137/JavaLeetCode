package com.leetcode.problems.problem4;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * leriksen137
 */
public class SolutionTest {
	Solution s;
	private final double TEST_PRECISION = 1e-15;

	@Before
	public void initializeSolution() {
		s = new Solution();
	}

	@Test
	public void testMergeTwoSortedArraysExample1() {
		int[] nums1 = new int[] { 1, 3 };
		int[] nums2 = new int[] { 2 };
		double solution = s.findMedianSortedArrays(nums1, nums2);
		assertEquals(solution, 2.0, TEST_PRECISION);
	}

	@Test
	public void testMergeTwoSortedArraysExample2() {
		int[] nums1 = new int[] { 1, 2 };
		int[] nums2 = new int[] { 3, 4 };
		double solution = s.findMedianSortedArrays(nums1, nums2);
		assertEquals(solution, 2.5, TEST_PRECISION);
	}
}
