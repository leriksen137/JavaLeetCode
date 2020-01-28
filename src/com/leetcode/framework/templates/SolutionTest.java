package com.leetcode.framework.templates;

import static org.junit.Assert.assertEquals;

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
	public void testTemplateTestName() {
		// create input

		// calculate "actual"
		int actual = s.calculateSolution();
		// create "expected"
		int expected = 0;

		assertEquals(expected, actual);
	}
}
