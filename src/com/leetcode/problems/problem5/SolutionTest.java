package com.leetcode.problems.problem5;

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
	public void testLongestPalindrome() {
		String input = "motbaab";
		String solution = s.longestPalindrome(input);

		assertTrue(solution.equals("baab"));
	}
}
