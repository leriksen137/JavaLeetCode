package com.leetcode.framework.templates;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * leriksen137
 */
@Ignore("This is only a template")
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
		assertTrue(solution.equals("solution"));
	}
}
