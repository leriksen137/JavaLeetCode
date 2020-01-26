package com.leetcode.problems.problem49;

import static org.junit.Assert.assertEquals;

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
	public void testGroupAnagramsSize() {
		String[] strs = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> solution = s.groupAnagrams(strs);
		assertEquals(solution.size(), 3);
	}
}
