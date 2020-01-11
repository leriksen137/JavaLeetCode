package com.leetcode.problems.problem20;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * leriksen137
 */
public class SolutionTest {

	@Test
	public void testIsValid() {
		Solution s = new Solution();
		String input = "{[]}";
		assertTrue(s.isValid(input));
	}
}
