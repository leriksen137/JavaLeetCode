package com.leetcode.problems.problem46;

import static org.junit.Assert.assertEquals;

import java.util.List;

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
	public void testPermute() {
		int[] nums = new int[] { 1, 2, 3 };
		List<List<Integer>> solution = s.permute(nums);
		assertEquals(solution.size(), 6);
	}
}
