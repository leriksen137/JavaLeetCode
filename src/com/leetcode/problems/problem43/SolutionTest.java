package com.leetcode.problems.problem43;

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
	public void testMultiply() {
		String num1 = "123";
		String num2 = "456";
		String solution = s.multiply(num1, num2);
		assertEquals(solution, "56088");
	}
}
