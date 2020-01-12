package com.leetcode.problems.problem34;

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
	public void testSearchRange() {
		int[] nums = new int[] { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		int[] solution = s.searchRange(nums, target);
		assertTrue(solution[0] == 3);
		assertTrue(solution[1] == 4);
	}
}
