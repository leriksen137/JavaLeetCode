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
		int solution = s.longestValidParentheses(s0);
		assertEquals(solution, 2);

		String s1 = "(()()";
		solution = s.longestValidParentheses(s1);
		assertEquals(solution, 4);

		String s2 = "()((())";
		solution = s.longestValidParentheses(s2);
		assertEquals(solution, 4);

		String s3 = "()(()";
		solution = s.longestValidParentheses(s3);
		assertEquals(solution, 2);
	}
}
