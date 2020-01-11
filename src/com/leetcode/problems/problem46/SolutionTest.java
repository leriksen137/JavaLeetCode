package com.leetcode.problems.problem46;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * leriksen137
 */
public class SolutionTest {

	@Test
	public void testPermute() {
		Solution s = new Solution();
		int[] nums = new int[] { 1, 2, 3 };
		List<List<Integer>> solution = s.permute(nums);
		assertTrue(solution.size() == 6);
	}
}
