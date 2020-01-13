package com.leetcode.framework.datastructures;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int val) {
		this.val = val;
	}

	public static void printLevelOrder(TreeNode root) {
		int height = height(root);
		System.out.print('[');
		for (int i = 1; i <= height; i++) {
			printGivenLevel(root, i);
		}
		System.out.print(']');
	}

	public static int height(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			int leftHeight = height(root.left);
			int rightHeight = height(root.right);

			if (leftHeight > rightHeight) {
				return (leftHeight + 1);
			} else {
				return (rightHeight + 1);
			}
		}
	}

	public static void printGivenLevel(TreeNode root, int level) {
		if (root == null) {
			System.out.print("null,");
			return;
		}
		if (level == 1) {
			System.out.print(root.val + ",");
		} else if (level > 1) {
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);
		}
	}
}