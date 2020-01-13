package com.leetcode.problems.problem104;

import com.leetcode.framework.annotations.LeetCodeProblem;
import com.leetcode.framework.datastructures.TreeNode;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 104, problemName = "Maximum Depth of Binary Tree")
public class Solution {
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftDepth = 0;
		int rightDepth = 0;
		if (root.left != null) {
			leftDepth = maxDepth(root.left);
		}
		if (root.right != null) {
			rightDepth = maxDepth(root.right);
		}
		return Math.max(leftDepth, rightDepth) + 1;
	}
}