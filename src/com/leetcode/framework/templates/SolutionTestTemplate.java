package com.leetcode.framework.templates;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * leriksen137
 */
public class SolutionTestTemplate {
	SolutionTemplate s;

	@Before
	public void initializeSolution() {
		s = new SolutionTemplate();
	}

	@Test
	public void testMaxArea() {
		int[] nums = new int[] { 0 };
		String solution = s.calculateSolution(nums);
		assertTrue(solution.equals("Solution"));
	}
}
