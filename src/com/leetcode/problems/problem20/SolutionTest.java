package com.leetcode.problems.problem20;

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
	public void testIsValid() {
		String input = "{[]}";
		assertTrue(s.isValid(input));
	}
}
