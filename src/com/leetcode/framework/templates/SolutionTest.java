package com.leetcode.framework.templates;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * leriksen137
 */
@Ignore("This is only a template")
public class SolutionTest {
	Solution s;

	@Before
	public void initializeSolution() {
		s = new Solution();
	}

	@Test
	public void testMethod() {
		int[] nums = new int[] { 0 };
		int solution = s.calculateSolution(nums);
		assertTrue(solution == 0);
	}
}
