package com.leetcode.problems.problem34;

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
	public void testSearchRangeExample1() {
		int[] nums = new int[] { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		int[] actual = s.searchRange(nums, target);
		int[] expected = new int[] { 3, 4 };
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testSearchRangeExample2() {
		int[] nums = new int[] { 5, 7, 7, 8, 8, 10 };
		int target = 6;
		int[] actual = s.searchRange(nums, target);
		int[] expected = new int[] { -1, -1 };
		assertArrayEquals(expected, actual);
	}
}
