package com.leetcode.problems.problem104;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.framework.datastructures.TreeNode;

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
	public void testMaxArea() {
		TreeNode root = new TreeNode(3);
		TreeNode n1 = new TreeNode(9);
		TreeNode n2 = new TreeNode(20);
		TreeNode n5 = new TreeNode(15);
		TreeNode n6 = new TreeNode(7);
		root.left = n1;
		root.right = n2;
		n2.left = n5;
		n2.right = n6;

		int actual = s.maxDepth(root);
		int expected = 3;
		assertEquals(actual, expected);
	}
}
