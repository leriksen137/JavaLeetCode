package com.leetcode.problems.problem101;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
	public void testIsSymmetricExample1() {
		TreeNode root = new TreeNode(1);
		TreeNode n1 = new TreeNode(2);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(4);
		TreeNode n6 = new TreeNode(3);
		root.left = n1;
		root.right = n2;
		n1.left = n3;
		n1.right = n4;
		n2.left = n5;
		n2.right = n6;

		assertTrue(s.isSymmetric(root));
	}

	@Test
	public void testIsSymmetricExample2() {
		TreeNode root = new TreeNode(1);
		TreeNode n1 = new TreeNode(2);
		TreeNode n2 = new TreeNode(2);
		TreeNode n4 = new TreeNode(3);
		TreeNode n6 = new TreeNode(3);
		root.left = n1;
		root.right = n2;
		n1.right = n4;
		n2.right = n6;

		assertFalse(s.isSymmetric(root));
	}

	@Test
	public void testFaildExample() {
		TreeNode root = new TreeNode(3);
		TreeNode n1 = new TreeNode(4);
		TreeNode n2 = new TreeNode(5);
		root.left = n1;
		n1.right = n2;

		assertFalse(s.isSymmetric(root));
	}
}
