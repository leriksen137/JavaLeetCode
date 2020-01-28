package com.leetcode.problems.problem10;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * leriksen137
 */
public class SolutionTest {
	Solution solution;

	@Before
	public void initializeSolution() {
		solution = new Solution();
	}

	@Test
	public void testRegularExpressionMatchingExample1() {
		String s = "aa";
		String p = "a";
		boolean actual = solution.isMatch(s, p);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void testRegularExpressionMatchingExample2() {
		String s = "aa";
		String p = "a*";
		boolean actual = solution.isMatch(s, p);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void testRegularExpressionMatchingExample3() {
		String s = "ab";
		String p = ".*";
		boolean actual = solution.isMatch(s, p);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void testRegularExpressionMatchingExample4() {
		String s = "aab";
		String p = "c*a*b";
		boolean actual = solution.isMatch(s, p);
		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void testRegularExpressionMatchingExample5() {
		String s = "mississippi";
		String p = "mis*is*p*.";
		boolean actual = solution.isMatch(s, p);
		boolean expected = false;
		assertEquals(expected, actual);
	}
}
