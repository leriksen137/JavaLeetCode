package com.leetcode.problems.problem17;

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
	public void testLetterCombinations() {
		String input = "23";
		List<String> solution = s.letterCombinations(input);

		assertTrue(solution.size() == 9);
	}
}
