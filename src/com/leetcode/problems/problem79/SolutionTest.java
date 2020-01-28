package com.leetcode.problems.problem79;

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
	public void testWordSearchExample1() {
		char[][] board = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		boolean actual = s.exist(board, word);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void testWordSearchExample2() {
		char[][] board = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "SEE";
		boolean actual = s.exist(board, word);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void testWordSearchExample3() {
		char[][] board = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCB";
		boolean actual = s.exist(board, word);
		boolean expected = false;
		assertEquals(expected, actual);
	}
}
