package com.leetcode.problems.problem22;

import static org.junit.Assert.assertTrue;

import java.util.List;

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
	public void testGenerateParenthesis() {
		int n = 3;
		List<String> solution = s.generateParenthesis(n);
		assertTrue(solution.size() == 5);
	}
}
