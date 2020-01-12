package com.leetcode.problems.problem39;

import static org.junit.Assert.assertTrue;

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
	public void testCombinationSum() {
		int[] candidates = new int[] { 2, 3, 6, 7 };
		int target = 7;
		List<List<Integer>> solution = s.combinationSum(candidates, target);
		assertTrue(solution.size() == 2);
		assertTrue(solution.get(0).size() < 4);
	}
}
