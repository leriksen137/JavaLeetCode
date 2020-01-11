package com.leetcode.problems.problem22;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
 * leriksen137
 */
public class SolutionTest {

	@Test
	public void testGenerateParenthesis() {
		Solution s = new Solution();
		int n = 3;
		List<String> solution = s.generateParenthesis(n);
		assertTrue(solution.size() == 5);
	}
}
