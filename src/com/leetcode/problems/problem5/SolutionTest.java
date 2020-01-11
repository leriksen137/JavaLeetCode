package com.leetcode.problems.problem5;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * leriksen137
 */
public class SolutionTest {

	@Test
	public void testLongestPalindrome() {
		Solution s = new Solution();
		String input = "motbaab";
		String solution = s.longestPalindrome(input);

		assertTrue(solution.equals("baab"));
	}
}
