package com.leetcode.problems.problem10;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * leriksen137
 */
public class SolutionTest {
	Solution m_s;

	@Before
	public void initializeSolution() {
		m_s = new Solution();
	}

	@Test
	public void testRegularExpressionMatchingExample1() {
		String s = "aa";
		String p = "a";

		assertFalse(m_s.isMatch(s, p));
	}

	@Test
	public void testRegularExpressionMatchingExample2() {
		String s = "aa";
		String p = "a*";

		assertTrue(m_s.isMatch(s, p));
	}

	@Test
	public void testRegularExpressionMatchingExample3() {
		String s = "ab";
		String p = ".*";

		assertTrue(m_s.isMatch(s, p));
	}

	@Test
	public void testRegularExpressionMatchingExample4() {
		String s = "aab";
		String p = "c*a*b";

		assertTrue(m_s.isMatch(s, p));
	}

	@Test
	public void testRegularExpressionMatchingExample5() {
		String s = "mississippi";
		String p = "mis*is*p*.";

		assertFalse(m_s.isMatch(s, p));
	}
}
