package com.leetcode.problems.problem32;

import static org.junit.Assert.assertEquals;

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
	public void testLongestValidParentheses() {
		String s0 = "())";
		int actual = s.longestValidParentheses(s0);
		int expected = 2;
		assertEquals(expected, actual);

		String s1 = "(()()";
		actual = s.longestValidParentheses(s1);
		expected = 4;
		assertEquals(expected, actual);

		String s2 = "()((())";
		actual = s.longestValidParentheses(s2);
		expected = 4;
		assertEquals(expected, actual);

		String s3 = "()(()";
		actual = s.longestValidParentheses(s3);
		expected = 2;
		assertEquals(expected, actual);
	}
}
