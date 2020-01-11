package com.leetcode.problems.problem43;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * leriksen137
 */
public class SolutionTest {

	@Test
	public void testMultiply() {
		Solution s = new Solution();
		String num1 = "123";
		String num2 = "456";
		String solution = s.multiply(num1, num2);
		assertTrue(solution.equals("56088"));
	}
}
