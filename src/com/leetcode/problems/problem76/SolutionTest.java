package com.leetcode.problems.problem76;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * leriksen137
 */
public class SolutionTest {
	Solution solution;

	@Before
	public void initializeSolution() {
		solution = new Solution();
	}

	@Test
	public void testMinWindowExample() {
		String s = "ADOBECODEBANC";
		String t = "ABC";
		String actual = solution.minWindow(s, t);
		String expected = "BANC";
		assertEquals(expected, actual);
	}
}
