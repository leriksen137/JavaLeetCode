package com.leetcode.problems.problem101;

import com.leetcode.framework.annotations.LeetCodeProblem;
import com.leetcode.framework.datastructures.TreeNode;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 101, problemName = "Symmetric Tree")
public class Solution {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		} else {
			return isSymmetricRecursive(root.left, root.right);
		}
	}

	private boolean isSymmetricRecursive(TreeNode left, TreeNode right) {
		if (left == null || right == null)
			return left == right;
		if (left.val != right.val)
			return false;
		return isSymmetricRecursive(left.left, right.right) && isSymmetricRecursive(left.right, right.left);
	}
}